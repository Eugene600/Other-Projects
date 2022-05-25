fun main() {
    //val lambdaFunc: (Int,Int) ->Int = {x,y -> x + y}
    AddTwoNumbers(2,5,{x,y -> x + y})
}

fun AddTwoNumbers(a:Int,b:Int,func:(Int,Int)->Int){
    val result= func(a,b)
    println(result)
}