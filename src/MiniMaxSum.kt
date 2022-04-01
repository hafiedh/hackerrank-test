fun main() {
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    miniMaxSum(arr)
}

fun miniMaxSum(arr: Array<Int>) {
    var min = Int.MAX_VALUE
    var max = 0
    var sum = 0L
    for (number in arr) {
        sum += number
        if (number < min) min = number
        if (number > max) max = number
    }
     print("${sum - max} ${sum - min}" )
}