package Data_Class

fun main(args:Array<String>)
{
    val book : Book = Book("Kotlin","TutorialsPoint.com",5)
    println("Name of the Book is --" +book.name)  //Kotlin
    println("Publisher Name --" +book.publisher)  //TutorialsPoint.com
    println("Review of the book is --" +book.reviewScore)  //5
    book.reviewScore = 7
    println("Printing all the info all together--" +book.toString())

    //Using inbuilt function of data class
    println("Example of the hashCode function " +book.hashCode())
}

data class Book(val name : String , val publisher :String , var reviewScore : Int)