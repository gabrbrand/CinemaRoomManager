fun intDivision(x: String, y: String) = try {
    x.toInt() / y.toInt()
} catch (e: ArithmeticException) {
    println("Exception: division by zero!")
    0
} catch (e: NumberFormatException) {
    println("Read values are not integers.")
    0
}

fun main() {
    val x = readln()
    val y = readln()
    println(intDivision(x, y))
}