// !WITH_NEW_INFERENCE
// !DIAGNOSTICS: -UNUSED_VARIABLE

class X

operator fun <T> X.component1(): T = TODO()

fun test() {
    val (y) = <!NI;COMPONENT_FUNCTION_MISSING, OI;TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>X()<!>
}