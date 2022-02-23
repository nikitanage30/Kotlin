package ObjectsAndClasses

class myClass
{
    private var name : String = "Nikki Nage"

    fun printMe()
    {
        println("Name :" +name)
    }
}

fun main(args: Array<String>)
{
    val obj = myClass()
    obj.printMe()
}