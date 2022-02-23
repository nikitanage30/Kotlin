package Collections

fun main()
{
  //  val theList = listOf("one","two","three","four")

    //Using toString() function
   // println(theList.toString())

    //Using Iterator
    /*val itr = theList.listIterator()
    while(itr.hasNext())
    {
        println(itr.next())
    }
      */

    //Using for loop
    /* for(i in theList.indices)
    {
        println(theList[i])
    }
    */
    //Using for-each loop

   // theList.forEach { println(it)}  //it works like this operator in Java.

    //Size of the list
   // println("Size of the list : " +theList.size)

    //Using in operator
   /* if("five" in theList)
    {
        println(true)
    }
    else
    {
        println(false)
    }   */

    //Using contain() method
  /*  if(theList.contains("two"))
    {
        println(true)
    }
    else
    {
        println(false)
    }  */

    //Using isEmpty() method
   /* if(theList.isEmpty())
    {
        println(true)
    }
    else
    {
        println(false)
    }  */

    //Using indexOf() method
   // println("Index of two :" +theList.indexOf("two"))

    //Using get() method
   // println("Element at 3rd position is : " +theList.get(2))

    //List Addition
  /*  val list1 = listOf("one","two","three")
    val list2 = listOf("four","five","six")
    val result = list1 + list2
    println(result)   */

    //List Subtraction
   /* val list3 = listOf("one","two","three")
    val list4 = listOf("two","three","four")
    val result = list3 - list4
    println(result)  */

    //Slicing a list
   /* val theList1 = listOf("one","two","three","four","five")
    val theResult1 = theList1.slice(2..4)
    println(theResult1)  */

    //Removing null a list
 /*   val theList2 = listOf("one","two","three",null,"four",null)
    val theResult2 = theList2.filterNotNull()
    println(theResult2)  */

    //Filtering the elements
   /* val theList3 = listOf(10, 20, 30, 31, 40, 50, -1, 0)
    val resultList3 = theList.filter{ it > 30}
    println(resultList3)  */

    //Dropping first N elements
   /* val theList4 = listOf(10, 20, 30, 31, 40, 50, -1, 0)
    val resultList4 = theList.drop(3)
    println(resultList4)  */

    //Grouping list elements
   /* val theList5 = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList5 = theList5.groupBy{ it % 3}
    println(resultList5) */

    //Mapping list elements
  /*  val theList6 = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList6 = theList6.map{ it / 3 }
    println(resultList6)  */

    //Chunking list elements
   /* val theList7 = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList7 = theList7.chunked(3)
    println(resultList7)  */

    //Windowing list elements
    val theList = listOf(10, 12, 30, 31, 40, 9, -3, 0)
    val resultList = theList.windowed(3)
    println(resultList)
}

