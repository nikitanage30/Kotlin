package Collections

fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
  //  println(theMap)

  /*  val theMutableMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(theMutableMap)   */

   /* val theMap1 = HashMap<String,Int>()

    theMap1["one"] = 1
    theMap1["two"] = 2
    theMap1["three"] = 3
    theMap1["four"] = 4
    theMap1["five"] = 5
    println(theMap1)  */

    //Using Pair() method
  /*  val theMap2 = mapOf(Pair("one",1),Pair("two",2), Pair("three",3))
    println(theMap2)  */

    //Properties
  /*  println("Enteries :" +theMap.entries)
    println("Keys :" +theMap.keys)
    println("Values :" +theMap.values)  */

    //Using Iterator
  /*  val itr = theMap.keys.iterator()
    while (itr.hasNext()) {
        val key = itr.next()
        val value = theMap[key]
        println("${key}=$value")
    }  */

    //Using for loop
  /*  for ((k, v) in theMap) {
        println("$k = $v")
    }    */

    //Using forEach
  /*   theMap.forEach {
            k, v -> println("Key = $k, Value = $v")
    }  */

    //Size
  /*  println("Size of the Map " + theMap.size)
    println("Size of the Map " + theMap.count())  */

    //containsKey() & containsValue() method
  /*  if(theMap.containsKey("two")){
        println(true)
    }else{
        println(false)
    }

    if(theMap.containsValue(5)){
        println(true)
    }else{
        println(false)
    }   */

    //removing entries from map
 /*  val theMap3 =  mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    theMap3.remove( "two")
    println(theMap3)

    theMap3 -= listOf("three")
    println(theMap3)  */

    //Filtering map elements
  /*  var resultMap = theMap.filterValues{ it > 2}
    println(resultMap)

    resultMap = theMap.filterKeys{ it == "two"}
    println(resultMap)

    resultMap = theMap.filter{ it.key == "two" || it.value == 4}
    println(resultMap)  */

    //map() method
    val resultMap = theMap.map{ (k, v) -> "Key is $k, Value is $v" }

    println(resultMap)
}