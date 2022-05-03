package problemsolving

fun findDigits(n: Int): Int {

    var count = 0
    var num = n
    while (num > 0) {
        val digit = num % 10
        if (digit != 0 && n % digit == 0) {
            count++
        }
        num /= 10
    }
    return count
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
