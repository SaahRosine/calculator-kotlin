interface Drawable {
    fun draw()
}

class Circle(val radius: Int) : Drawable {
    override fun draw() {
        println("Drawing a Circle with radius $radius:")
        // A simple ASCII representation of a circle
        println("  ***  ")
        println(" *   * ")
        println("*     *")
        println(" *   * ")
        println("  ***  ")
    }
}

class Square(val sideLength: Int) : Drawable {
    override fun draw() {
        println("Drawing a Square with side length $sideLength:")
        // A simple ASCII representation of a square
        for (i in 0 until sideLength) {
            for (j in 0 until sideLength) {
                print("* ")
            }
            println()
        }
    }
}

fun main() {
    val myCircle = Circle(radius = 3)
    val mySquare = Square(sideLength = 4)

    myCircle.draw()
    println()
    mySquare.draw()
}
