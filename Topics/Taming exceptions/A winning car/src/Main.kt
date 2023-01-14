const val MIN_MAX_SPEED = 120
const val MIN_ACC_TIME = 2
const val MAX_ACC_TIME = 4

fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()

    if (maxSpeed < MIN_MAX_SPEED || accTime !in MIN_ACC_TIME..MAX_ACC_TIME) {
        throw Exception("The race can't be won with this car")
    }

    return "I will definitely win!"
}