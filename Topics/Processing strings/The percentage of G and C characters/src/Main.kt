fun main() {
    /*
    Read a genome sequence from the user and covert it
    to a lowercase string to be case independent
     */
    val sequence = readln().lowercase()

    // Count the number of guanine and cytosine
    val numberOfGuanine = sequence.count { it == 'g' }
    val numberOfCytosine = sequence.count { it == 'c' }

    // Calculate the percentage of guanine and cytosine
    val percentageOfGuanineAndCytosine = (numberOfGuanine + numberOfCytosine).toDouble() / sequence.length * 100

    // Print the percentage
    println(percentageOfGuanineAndCytosine)
}

// /**
// * Calculates the percentage of guanine and cytosine in a genome sequence
// *
// * @param sequence genome sequence
// * @return percentage of guanine and cytosine in the genome sequence
// */
// fun getPercentageOfGAndC(sequence: String): Double {
//    // Convert the sequence to a lowercase string to be case independent
//    sequence.lowercase()
//
//    // Count the number of guanine and cytosine
//    val numberOfGuanine = sequence.count { it == 'g' }
//    val numberOfCytosine = sequence.count { it == 'c' }
//
//    // Return the percentage of guanine and cytosine
//    return (numberOfGuanine + numberOfCytosine).toDouble() / sequence.length * 100
// }