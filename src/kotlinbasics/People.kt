package kotlinbasics

abstract class People {
    abstract val image: String
    abstract val food : String
    abstract val habit : String
     var hunger = 10

    abstract fun makeNoise()
    abstract fun eat()
    open fun sleep(){
        println("Sleeping")
    }
}

class Shafi() : People() {
    override val image: String
        get() {
            return ""
        }
    override val food: String
        get() {
           return "Sweet"
        }
    override val habit: String = ""

    override fun makeNoise() {

    }

    override fun eat() {

    }

}
class Jakee(override val image: String, override val food: String, override val habit: String) : People() {
    override fun makeNoise() {

    }

    override fun eat() {

    }

}

interface Roamable {
    var velocity: Int
        get() = 20
        set(value) { //can not set value to field
            println("Unable to update velocity") //valid
            //field = value   ->>>> //it's not valid
        }
}
interface Runable {
    fun run(){
        println("Running")
    }
}

class Abdulllah : Roamable, Runable{
    override fun run() {
        super.run()
    }
}

fun main () {
    val abdulllah = Abdulllah()
    println(abdulllah.run())
}