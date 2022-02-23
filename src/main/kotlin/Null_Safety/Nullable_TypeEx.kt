package Null_Safety

fun main(args: Array<String>) {
    // variable is declared as nullable
    var s2: String? = "Good Morning"

    s2 = null // no compiler error

   // println(s2.length) // compiler error because string can be null
}
