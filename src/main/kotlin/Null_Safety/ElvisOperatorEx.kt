package Null_Safety

fun main(args:Array<String>)
{
    var str : String? = "Hello World"
    println(str?.length)
    str = null
    println(str?.length ?: -1)
}