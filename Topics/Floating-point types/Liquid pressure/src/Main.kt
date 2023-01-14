const val GRAVITY_ACCELERATION = 9.8

fun main() {
    val liquidDensity = readln().toDouble()
    val columnHeight = readln().toDouble()

    val liquidPressure = liquidDensity * GRAVITY_ACCELERATION * columnHeight

    println(liquidPressure)
}