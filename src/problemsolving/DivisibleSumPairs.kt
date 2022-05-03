package problemsolving


fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var counter = 0
    for (i in 0 until n - 1) {
        for (j in i + 1 until n) {
            if ((ar[i] + ar[j]) % k == 0) {
                counter += 1
            }
        }
    }
    return counter
}
