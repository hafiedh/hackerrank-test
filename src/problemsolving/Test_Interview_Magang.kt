
fun main() {
    println(swap(30, 50))
    hollowBox(5)
    print(reverse("Hello"))
}

private fun hollowBox(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
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
