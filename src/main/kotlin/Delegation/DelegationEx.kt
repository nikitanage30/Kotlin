package Delegation

interface Base
{
    fun printMe() //abstract method
}

class BaseImpl(val x : Int) : Base
{
    override fun printMe()
    {
        println(x) // implementation of method
    }
}

class Derived(b : Base) : Base by b //delegating the public method on object b
fun main(args:Array<String>)
{
    val b= BaseImpl(10)
    Derived(b).printMe()
}