@SuppressWarnings("MagicNumber")
fun main() {
    val temperatureInCelsius = readln().toDouble()
    val fahrenheit = { celsius: Double -> celsius * 1.8 + 32 }
    println(fahrenheit(temperatureInCelsius))
}