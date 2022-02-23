package Constructors

class Person
{
    //Member variables
    var name : String
    var age : Int

    //Initializer block
    init
    {
        println("Initializer Block")
    }

    //Secondary constructor
    constructor(_name : String , _age : Int)
    {
        this.name = _name
        this.age = _age
        println("Name = $name")
        println("Age = $age")
    }
}

fun main(args: Array<String>)
{
    val person1 = Person("Nikita",23)

}