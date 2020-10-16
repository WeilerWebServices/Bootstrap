/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.plugins

import org.gradle.jvm.application.scripts.JavaAppStartScriptGenerationDetails
import org.gradle.util.TextUtil
import org.gradle.util.WrapUtil
import spock.lang.Specification

class WindowsStartScriptGeneratorTest extends Specification {

    WindowsStartScriptGenerator generator = new WindowsStartScriptGenerator()

    def "classpath for windows script uses backslash as path separator and windows line separator"() {
        given:
        JavaAppStartScriptGenerationDetails details = createScriptGenerationDetails(null, 'bin')
        Writer destination = new StringWriter()

        when:
        generator.generateScript(details, destination)

        then:
        destination.toString().contains("set CLASSPATH=%APP_HOME%\\path\\to\\Jar.jar")
    }

    def "windows script uses windows line separator"() {
        given:
        JavaAppStartScriptGenerationDetails details = createScriptGenerationDetails(null, 'bin')
        Writer destination = new StringWriter()

        when:
        generator.generateScript(details, destination)

        then:
        destination.toString().split(TextUtil.windowsLineSeparator).length == 103
    }

    def "defaultJvmOpts is expanded properly in windows script"() {
        given:
        JavaAppStartScriptGenerationDetails details = createScriptGenerationDetails(['-Dfoo=bar', '-Xint'], 'bin')
        Writer destination = new StringWriter()

        when:
        generator.generateScript(details, destination)

        then:
        destination.toString().contains('set DEFAULT_JVM_OPTS="-Dfoo=bar" "-Xint"')
    }

    def "defaultJvmOpts is expanded properly in windows script -- spaces"() {
        given:
        JavaAppStartScriptGenerationDetails details = createScriptGenerationDetails(['-Dfoo=bar baz', '-Xint'], 'bin')
        Writer destination = new StringWriter()

        when:
        generator.generateScript(details, destination)

        then:
        destination.toString().contains(/set DEFAULT_JVM_OPTS="-Dfoo=bar baz" "-Xint"/)
    }

    def "defaultJvmOpts is expanded properly in windows script -- double quotes"() {
        given:
        JavaAppStartScriptGenerationDetails details = createScriptGenerationDetails(['-Dfoo=b"ar baz', '-Xi""nt', '-Xpatho\\"logical'], 'bin')
        Writer destination = new StringWriter()

        when:
        generator.generateScript(details, destination)

        then:
        destination.toString().contains(/set DEFAULT_JVM_OPTS="-Dfoo=b\"ar baz" "-Xi\"\"nt" "-Xpatho\\\"logical"/)
    }

    def "defaultJvmOpts is expanded properly in windows script -- backslashes and shell metacharacters"() {
        given:
        JavaAppStartScriptGenerationDetails details = createScriptGenerationDetails(['-Dfoo=b\\ar baz', '-Xint%PATH%'], 'bin')
        Writer destination = new StringWriter()

        when:
        generator.generateScript(details, destination)

        then:
        destination.toString().contains(/set DEFAULT_JVM_OPTS="-Dfoo=b\ar baz" "-Xint%%PATH%%"/)
    }

    def "determines application-relative path"() {
        given:
        JavaAppStartScriptGenerationDetails details = createScriptGenerationDetails(null, 'bin/sample/start')
        Writer destination = new StringWriter()

        when:
        generator.generateScript(details, destination)

        then:
        destination.toString().contains('set APP_HOME=%DIRNAME%..\\..')
    }

    private JavaAppStartScriptGenerationDetails createScriptGenerationDetails(List<String> defaultJvmOpts, String scriptRelPath) {
        final String applicationName = 'TestApp'
        final List<String> classpath = WrapUtil.toList('path/to/Jar.jar')
        return new DefaultJavaAppStartScriptGenerationDetails(applicationName, null, null, null, defaultJvmOpts, classpath, scriptRelPath, null)
    }
}