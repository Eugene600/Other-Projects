fun main() {
   /* var chiwawa= Chiwawa()
    println(chiwawa.eat()) */

    var pussyCat=PussyCat()
    println(pussyCat.eat())
}

open class Creature{
    open fun eat(){
        println("Animal is eating")
    }


}

class Chiwawa:Creature() {
    fun bark(){
        println("Chiwawa is barking")
    }

    override fun eat(){
        println("Chiwawa is eating")
    }
}

class PussyCat:Creature(){
    fun meow(){
        println("Cat is Meowing!!")
    }
    override fun eat(){
        println("PussyCat is eating")
    }
}