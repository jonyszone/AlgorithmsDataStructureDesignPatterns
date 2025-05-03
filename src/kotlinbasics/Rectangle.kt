package kotlinbasics

class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = width == height
    val area: Int
        get() = width * height
}

fun main() {
    val rectangle = arrayOf(Rectangle(1, 1), Rectangle(1, 1)
    , Rectangle(1, 1), Rectangle(1, 1))

/*
    rectangle[2].width = (2+1) *3
    rectangle[2].height = (4+5)
    println("It is ${if (rectangle[2].isSquare) "" else "not "}a square")   */

    for (i in 0..3) {
        rectangle[i].width = (i+1) *3
        rectangle[i].height = (i+5)
        print("Rectangle $i has area ${rectangle[i].area} -> ")
        println("It is ${if (rectangle[i].isSquare) "" else "not "}a square")
    }
}