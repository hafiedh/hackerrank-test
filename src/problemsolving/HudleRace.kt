

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val height = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}

fun hurdleRace(k: Int, height: Array<Int>): Int {
    var result = 0
    var max = 0
    val map = HashSet<Int>()
    for (i in height) {
        if (i > k) map.add(i)
    }
    return if(map.size == 0) {
        0
    }else{
        for (i in map) {
            if (i > max) max = i
        }
        result = max - k
        result
    }
}