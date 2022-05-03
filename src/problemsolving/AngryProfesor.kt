package problemsolving

fun main(){
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}

fun angryProfessor(k: Int, a: Array<Int>): String {
    var count = 0
    for (i in a) {
        if (i <= 0) {
            count++
        }
    }
    return if (count < k) "YES" else "NO"
}