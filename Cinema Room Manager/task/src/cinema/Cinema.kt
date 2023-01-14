package cinema

fun main() {
    CinemaRoomManager()
}

class CinemaRoomManager {
    private var rows: Int
    private var columns: Int
    private val room: MutableList<MutableList<Char>>
    private val seats: Int

    private var purchasedTickets = 0
    private var currentIncome = 0

    init {
        println("Enter the number of rows: [1-9]")
        rows = readln().toInt()

        println("Enter the number of seats in each row: [1-9]")
        columns = readln().toInt()

        room = MutableList(rows) { MutableList(columns) { 'S' } }
        seats = rows * columns

        showMenu()
    }

    private fun showMenu() {
        while (true) {
            println()
            println("1. Show the seats")
            println("2. Buy a ticket")
            println("3. Statistics")
            println("0. Exit")

            val choice = readln().toInt()
            println()
            when (choice) {
                1 -> showSeats()
                2 -> buyTicket()
                3 -> showStatistics()
                0 -> break
            }
        }
    }

    private fun showSeats() {
        print("Cinema:\n ")
        (1..columns).forEach { columnNumber -> print(" $columnNumber") }
        println()
        repeat(rows) { i -> println("${i + 1} ${room[i].joinToString(" ")}") }
    }

    private fun buyTicket() {
        println("Enter a row number: [1-$rows]")
        val row = readln().toInt()

        println("Enter a seat number in that row: [1-$columns]")
        val column = readln().toInt()

        try {
            val isPurchased = room[row - 1][column - 1] == 'B'
            if (!isPurchased) {
                val ticketPrice = if (seats <= 60) 10 else if (row <= rows / 2) 10 else 8
                println("\nTicket price: \$$ticketPrice")

                room[row - 1][column - 1] = 'B'
                purchasedTickets++
                currentIncome += ticketPrice
            } else {
                println("\nThat ticket has already been purchased!\n")
                buyTicket()
            }
        } catch (e: IndexOutOfBoundsException) {
            println("\nWrong input!\n")
            buyTicket()
        }
    }

    private fun showStatistics() {
        println("Number of purchased tickets: $purchasedTickets")

        val percentage = "%.2f".format(purchasedTickets.toDouble() / seats.toDouble() * 100)
        println("Percentage: $percentage%")

        println("Current income: \$$currentIncome")

        val totalIncome = if (seats <= 60) {
            seats * 10
        } else {
            val incomeFrontHalf = rows / 2 * columns * 10
            val incomeBackHalf = (rows - rows / 2) * columns * 8
            incomeFrontHalf + incomeBackHalf
        }
        println("Total income: \$$totalIncome")
    }
}