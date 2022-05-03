package problemsolving

import java.math.BigInteger

fun extraLongFactorials(n: Int): Unit {
    var factorial = BigInteger.valueOf(1)
    for (i in 1..n) {
        factorial = factorial.multiply(BigInteger.valueOf(i.toLong()))
    }
    return println(factorial)
}




fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    extraLongFactorials(n)
}
