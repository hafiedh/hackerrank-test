package problemsolving

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}

fun utopianTree(n: Int): Int {
    var height = 1
    for (i in 1..n) {
        if (i % 2 == 0) {
            height += 1
        } else {
            height *= 2
        }
    }
    return height
}