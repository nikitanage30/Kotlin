package Null_Safety

fun main(args: Array<String>) {
    // created a list contains names
    var stringlist: List<String?> = listOf("Nikita","Saili", null, "Abhishek")
    // created new list
    var newlist = listOf<String?>()
    for (item in stringlist) {
        // executes only for non-nullable values
        item?.run { newlist = newlist.plus(this) } // this reference
        item?.also{it -> println(it)}
    }
}
