fun main() {
    var result1=Same<Int>(2,3)
    println(result1)

    var result2 = Same<String>("Eugene","Wachira")
    println(result2)


}

fun<T> Same(first:T,second:T){
    println("First:$first")
    println("Second:$second")
}