fun main() {
    val words = readln().split(' ')

    val longestWord = words.maxByOrNull { word -> word.length }!!

    println(longestWord)
}