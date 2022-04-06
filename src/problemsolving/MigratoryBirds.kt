

fun migratoryBirds(arr: Array<Int>): Int {
    val counter = IntArray(6)
    var result = 1
    var max = 0
    for (i in arr.indices) { // 0 to 5
        counter[arr[i]]+=1
    }
    for (i in 1..5) {
        println(counter[i])
        if (counter[i] > max) {
            max = counter[i]
            result = i
        }
    }

    return result
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
