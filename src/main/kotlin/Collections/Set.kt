package Collections

fun main() {
  //  val theSet = setOf("one", "two", "three", "four")
   // println(theSet)

   /* val theMutableSet = mutableSetOf("one", "two", "three", "four")
    println(theMutableSet) */

    //Using toString() function
  //  println(theSet.toString())

    //Using Iterator
  /*  val itr = theSet.asIterable().iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }  */

    //Using for loop
 /*   for (i in theSet.indices) {
        println(theSet.elementAt(i))
    }   */

    //Using for-each
   // theSet.forEach { println(it) }

    //Size of set
   // println("Size of the Set " + theSet.size)

    //in operator
  /*  if("two" in theSet){
        println(true)
    }else{
        println(false)
    }   */

    //Using contain() method
   /* if(theSet.contains("two")){
        println(true)
    }else{
        println(false)
    }  */

    //isEmpty() method
  /*  if(theSet.isEmpty()){
        println(true)
    }else{
        println(false)
    }   */

    //indexOf() method
   // println("Index of 'two' -  " + theSet.indexOf("two"))

    //elementAt() method
  //  println("Element at 3rd position :" + theSet.elementAt(2))

    //Sorting elements
  /*  val theSet1 = setOf(0, 20, 30, 31, 40, 50, -1, 0)
    var resultSet1 = theSet1.sorted()
    println(resultSet1)

    resultSet1 = theSet1.sortedDescending()
    println(resultSet1)  */


    //Mutable set
    val theSet2 = mutableSetOf(10, 20, 30)

    theSet2.add(40)
    theSet2.add(50)
    println(theSet2)

    theSet2.remove(10)
    theSet2.remove(30)
    println(theSet2)
}
