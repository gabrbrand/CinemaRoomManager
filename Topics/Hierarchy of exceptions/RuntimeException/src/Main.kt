fun main() {
    try {
        val number = 2 / 0
    } catch(e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}