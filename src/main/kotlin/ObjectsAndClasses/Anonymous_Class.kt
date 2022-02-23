package ObjectsAndClasses

fun main(args:Array<String>)
{
    var programmer : Human = object : Human{  //Anonymous Class
        override fun think(){ //Overriding think method
            print("I'm an example of anonymous inner class")

        }
    }
    programmer.think()
}

interface Human
{
    fun think()
}