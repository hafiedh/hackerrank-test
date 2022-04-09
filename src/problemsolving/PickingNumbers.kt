package problemsolving

import kotlin.math.abs


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
// create a subarray of absolute difference <= 1
fun pickingNumbers(a: Array<Int>): Int {
    val freq = IntArray(100)
    for (i in a) {
       val index = i - 1
        freq[index]++
    }
    var max = 0
    for (i in 0..99) {
        if (freq[i] > 0) {
            var count = freq[i]
            if (i + 1 < freq.size && freq[i + 1] > 0) {
                count += freq[i + 1]
            }
            if (count > max) {
                max = count
            }
        }
    }
    return max
}

