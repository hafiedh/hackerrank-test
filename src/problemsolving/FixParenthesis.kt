import java.util.*

fun main() {

    val reader = Scanner(System.`in`)
    val p = reader.nextLine()
    println(minParentheses(p))
}
fun minParentheses(p: String): Int {
    var bal = 0
    var ans = 0
    for (element in p) {
        if (element == '(') bal += 1 else bal -= 1
        // It is guaranteed bal >= -1
        if (bal == -1) {
            ans += 1
            bal += 1
        }
    }
    return bal + ans
}


 // if input { ()))((  } should return 4
//    bal = 0 ans = 1 , ans = 2
//
