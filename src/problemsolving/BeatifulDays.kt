package problemsolving

import kotlin.math.abs


fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var count = 0
    for (day in i..j) {
        val reversed = reverse(day)
        if (abs(day - reversed) % k == 0) {
            count++
        }
    }
    return count
}

private fun reverse(day: Int): Int {
    var reversed = 0
    var temp = day
    while (temp != 0) {
        reversed = reversed * 10 + temp % 10
        temp /= 10
    }
    return reversed
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val i = first_multiple_input[0].toInt()

    val j = first_multiple_input[1].toInt()

    val k = first_multiple_input[2].toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
