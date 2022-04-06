

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}

private fun countingValleys(steps: Int, path: String): Int {
    var result = 0
    var level = 0
    for (i in 0 until steps) {
        if (path[i] == 'D') {
            level--
        } else {
            level++
        }
        if (level == 0 && path[i] == 'U') {
            result++
        }
    }
    return result
}