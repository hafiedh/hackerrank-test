package problemsolving

fun main(){
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}

fun permutationEquation(p: Array<Int>): Array<Int> {
    val result = Array(p.size){0}
    val map = mutableMapOf<Int, Int>()
    for (i in p.indices) {
        map[p[i]] = i + 1
    }
    for (i in p.indices) {
        result[i] = map[map[i + 1]]!!
    }
    return result
}