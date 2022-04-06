fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}

// return minimal number of pages to turn
fun pageCount(n: Int, p: Int): Int {
    val frontList = p / 2
    val backList = if (n % 2 == 0) (n - p + 1) / 2 else (n - p) / 2
   return frontList.coerceAtMost(backList)
}