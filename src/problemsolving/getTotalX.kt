fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var total = 0
    for (x in 1..100) {
        var status = true
        for (element in b) {
            if (element % x != 0) {
                status = false
                break
            }
        }
        if (status) {
            for (element in a) {
                if (x % element != 0) {
                    status = false
                    break
                }
            }
        }
        if (status) {
            total++
        }
    }
    return total
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}