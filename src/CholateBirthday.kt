fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var ways = 0
    var sum = 0
    //Find if there is a way to break the chocolate at all
    if (m <= s.size)
        for (i in 0 until m) {
            sum += s[i]
        }
    if (sum == d) ways++
    for (i in 0 until s.size - m) {
        sum = sum - s[i] + s[i + m]
        println(sum)
        if (sum == d)
            ways++
    }
    return ways
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
