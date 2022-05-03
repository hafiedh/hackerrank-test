package problemsolving

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {

    val result = Array(queries.size) { 0 }
    val rotated = a.rotate(k)
    for (i in queries.indices) {
        result[i] = rotated[queries[i]]
    }
    return result
}

fun Array<Int>.rotate(k: Int): Array<Int> {
    val result = Array(this.size) { 0 }
    for (i in this.indices) {
        result[(i + k) % this.size] = this[i]
    }
    return result
}


fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val q = first_multiple_input[2].toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val queries = Array<Int>(q, { 0 })
    for (i in 0 until q) {
        val queriesItem = readLine()!!.trim().toInt()
        queries[i] = queriesItem
    }

    val result = circularArrayRotation(a, k, queries)

    println(result.joinToString("\n"))
}