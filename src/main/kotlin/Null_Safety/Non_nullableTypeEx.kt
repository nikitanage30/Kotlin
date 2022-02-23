package Null_Safety

fun main(args:Array<String>)
{
    //variable is declared as non-nullable
    var s1 : String = "Hello"

    //s1 = null //gives compilation error
    print("The length of string s1 is :" +s1.length)
}