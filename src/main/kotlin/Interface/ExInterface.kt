package Interface

interface ExampleInterface
{
    var myVar : Int //Abstract property
    fun absMethod() : String // Abstract method

    fun hello()
    {
        println("Hello there , Welcome to my world!!!!")
    }
}

class InterfaceImp : ExampleInterface
{
    override var myVar: Int = 25
    override fun absMethod(): String = "Good Afternoon"
}

fun main(args:Array<String>)
{
    val obj = InterfaceImp()
    println("My Variable value is = ${obj.myVar}")
    print("Calling hello() : ")
    obj.hello()

    print("Message :")
    println(obj.absMethod())
}