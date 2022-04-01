
import java.util.*


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)



    println(result)
}

fun sockMerchant(n: Int, ar: Array<Int>): Any {
    val set = HashSet<Int>()
    var count = 0
    for (i in 0 until n) {
        if (set.contains(ar[i])) {
            set.remove(ar[i])
            count++
        } else {
            set.add(ar[i])
        }
    }
    return count
}
