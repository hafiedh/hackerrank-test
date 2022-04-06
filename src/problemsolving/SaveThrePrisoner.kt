fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val m = first_multiple_input[1].toInt()

        val s = first_multiple_input[2].toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}

private fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    return if ((m % n + s - 1) % n == 0) {
        n
    } else {
        (m % n + s - 1) % n
    }
}
