import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val moneySpent = getMoneySpent(keyboards, drives, b)
    println(moneySpent)
}

private fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    var max = -1
    for (i in keyboards) {
        for (j in drives) {
            if (i + j in (max + 1)..b) {
                max = i + j
            }
        }
    }
    return max
}

