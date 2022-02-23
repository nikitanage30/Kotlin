package ObjectsAndClasses

class Outer
{
    private val name : String = "Nikita"
    inner class Inner
    {
        fun foo() = name
    }
}

fun main(args:Array<String>)
{
    val obj = Outer().Inner()
    println(obj.foo())
}