package Generic_Class

class Company<T> (text : T){
    var x = text
    init{
        println(x)
    }
}
fun main(args: Array<String>){
    var name: Company<String> = Company<String>("GeeksforGeeks")
    var rank: Company<Int> = Company<Int>(12)
}
