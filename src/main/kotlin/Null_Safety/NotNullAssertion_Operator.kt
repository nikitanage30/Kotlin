package Null_Safety

fun main(args:Array<String>)
{
    var str : String? = "Good Afternoon"
    println(str!!.length)
    str = null
   // str!!.length //throws error
}