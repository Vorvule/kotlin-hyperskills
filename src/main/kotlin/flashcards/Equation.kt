package flashcards

import kotlin.math.*

class Equation {
    fun findResult() {
        val a = readln().toDouble()
        val b = readln().toDouble()
        val c = readln().toDouble()

        val x1 = (-b - sqrt(b * b - 4 * a * c)) / (2 * a)
        val x2 = (-b + sqrt(b * b - 4 * a * c)) / (2 * a)

        print(x1)
        print(" ")
        print(x2)
    }
}