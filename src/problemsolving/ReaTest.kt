fun main() {

    val n = readLine()!!.trim().toInt()
    staircase(n)

}

fun staircase(n: Int) {
    for (i in 1..n) {
        for (s in 1..n - i) {
           print(" ")
        }
        for (h in 1..i){
            print("#")
        }
        println()
    }
}
