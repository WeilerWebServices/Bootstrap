annotation class A1
annotation class A2(val some: Int = 12)

fun <<!WRONG_ANNOTATION_TARGET!>@A1<!> <!WRONG_ANNOTATION_TARGET!>@A2(3)<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A2<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A1(<!TOO_MANY_ARGUMENTS!>12<!>)<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A2(<!TYPE_MISMATCH!>"Test"<!>)<!>  T> topFun() = 12

class SomeClass {
    fun <<!WRONG_ANNOTATION_TARGET!>@A1<!> <!WRONG_ANNOTATION_TARGET!>@A2(3)<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A2<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A1(<!TOO_MANY_ARGUMENTS!>12<!>)<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A2(<!TYPE_MISMATCH!>"Test"<!>)<!> T> method() = 12

    fun foo() {
        fun <<!WRONG_ANNOTATION_TARGET!>@A1<!> <!WRONG_ANNOTATION_TARGET!>@A2(3)<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A2<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A1(<!TOO_MANY_ARGUMENTS!>12<!>)<!> <!REPEATED_ANNOTATION, WRONG_ANNOTATION_TARGET!>@A2(<!TYPE_MISMATCH!>"Test"<!>)<!>  T> innerFun() = 12
    }
}