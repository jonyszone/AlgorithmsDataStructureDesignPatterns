package kotlinbasics

open class Animal{
    open val image = ""
    open val food = ""
    open val habit = ""
    open val hunger = 10

    open fun makeNoise(){
        print("Making Noise")
    }
    open fun eat(){
        println("Eating")
    }
    open fun sleep(){
        println("Sleeping")
    }
}
abstract class People{
    abstract val name: String
    abstract val age: String
    abstract val habitat: String
}

open class Hippo : Animal() {
    override val image: String
        get() = "Hippo.jpg"
    override val food: String
        get() = super.food
    override val habit: String
        get() = super.habit
    override val hunger: Int
        get() = super.hunger

    override fun makeNoise() {
        //super.makeNoise()
        println("Hippo is making noise")
    }

    final override fun sleep() {
        println("First hippo sleeping")
    }
}

class AnotherHippo : Hippo(){
    override fun makeNoise() {
        //super.makeNoise()
        println("Another hippo is making noise")
    }
}

fun main(){
    val hippo = Hippo()
    val anotherHippo = AnotherHippo()
    println(anotherHippo.makeNoise()); return
    println(hippo.image)
    println(hippo.makeNoise())
}