"""The command-line interface for Fava."""

import os
import errno

import click
from werkzeug.contrib.profiler import ProfilerMiddleware
from werkzeug.middleware.dispatcher import DispatcherMiddleware
from cheroot import wsgi

from fava.application import app
from fava.util import simple_wsgi
from fava import __version__


# pylint: disable=too-many-arguments
@click.command(context_settings=dict(auto_envvar_prefix="FAVA"))
@click.argument(
    "filenames",
    nargs=-1,
    type=click.Path(exists=True, dir_okay=False, resolve_path=True),
)
@click.option(
    "-p",
    "--port",
    type=int,
    default=5000,
    show_default=True,
    metavar="<port>",
    help="The port to listen on.",
)
@click.option(
    "-H",
    "--host",
    type=str,
    default="localhost",
    show_default=True,
    metavar="<host>",
    help="The host to listen on.",
)
@click.option("--prefix", type=str, help="Set an URL prefix.")
@click.option(
    "--incognito",
    is_flag=True,
    help="Run in incognito mode and obscure all numbers.",
)
@click.option("-d", "--debug", is_flag=True, help="Turn on debugging.")
@click.option(
    "--profile", is_flag=True, help="Turn on profiling. Implies --debug."
)
@click.option(
    "--profile-dir",
    type=click.Path(),
    help="Output directory for profiling data.",
)
@click.version_option(version=__version__, prog_name="fava")
def main(
    filenames, port, host, prefix, incognito, debug, profile, profile_dir
):
    """Start Fava for FILENAMES on http://<host>:<port>.

    If the `BEANCOUNT_FILE` environment variable is set, Fava will use the
    files (space-delimited) specified there in addition to FILENAMES.

    Note you can also specify command-line options via environment variables.
    For example, `--host=0.0.0.0` is equivalent to setting the environment
    variable `FAVA_HOST=0.0.0.0`.
    """

    if profile:  # pragma: no cover
        debug = True

    env_filename = os.environ.get("BEANCOUNT_FILE")
    if env_filename:
        filenames = filenames + tuple(env_filename.split())

    if not filenames:
        raise click.UsageError("No file specified")

    app.config["BEANCOUNT_FILES"] = filenames
    app.config["INCOGNITO"] = incognito

    if prefix:
        app.wsgi_app = DispatcherMiddleware(
            simple_wsgi, {prefix: app.wsgi_app}
        )

    if not debug:
        server = wsgi.Server((host, port), app)
        print("Running Fava on http://{}:{}".format(host, port))
        server.safe_start()
    else:
        if profile:
            app.config["PROFILE"] = True
            app.wsgi_app = ProfilerMiddleware(
                app.wsgi_app,
                restrictions=(30,),
                profile_dir=profile_dir if profile_dir else None,
            )

        app.jinja_env.auto_reload = True
        try:
            app.run(host, port, debug)
        except OSError as error:
            if error.errno == errno.EADDRINUSE:
                raise click.UsageError(
                    "Can not start webserver because the port is already in "
                    "use. Please choose another port with the '-p' option."
                )
            raise


# needed for pyinstaller:
if __name__ == "__main__":  # pragma: no cover
    main()  # pylint: disable=no-value-for-parameter