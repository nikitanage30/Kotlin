package Null_Safety

fun main(args:Array<String>)
{
    //created a list contains names
    var stringlist : List<String?> = listOf("Nikita","Saili",null,"Abhishek")
    //created new list
    var newlist = listOf<String?>()
    for(item in stringlist)
    {
        //executes only for non-nullable values
        item?.let { newlist = newlist.plus(it) }
    }
    //to print the elements stored in newlist
    for(items in newlist)
    {
        println(items)
    }

}