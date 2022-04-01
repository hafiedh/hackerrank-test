fun breakingRecords(scores: Array<Int>): Array<Int> {
    var max = 0
    var min = 0

    var maxCounter = 0
    var minCounter = 0

    for (i in scores.indices) {
        val value = scores[i]
        if (i != 0) {
            if (value > max) {
                max = value
                maxCounter++
            } else if (value < min) {
                min = value
                minCounter++
            }
        } else {
            max = value
            min = value
        }
    }
    return listOf(maxCounter, minCounter).toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
