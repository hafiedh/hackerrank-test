package test
fun main() {
//    println(swap(30, 50))
    hollowBox(5)
//    print(reverse("Hello"))
}

private fun hollowBox(n: Int) {
    for (i in 1..n) {
        for (j in 1..n) {
            if (i == 1 || i == n || j == 1 || j == n) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}


private fun reverse(str: String): String {
    var result = ""
    for (i in str.length - 1 downTo 0) {
        result += str[i]
    }
    return result
}

private fun swap(a:Int, b:Int): Pair<Int, Int> {
    return Pair(b, a)
}
