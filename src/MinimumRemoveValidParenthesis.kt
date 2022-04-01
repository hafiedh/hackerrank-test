import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    val p = reader.nextLine()
    println(minRemoveToMakeValid(p))
}
fun minRemoveToMakeValid(S: String): String {
    val ans = S.toCharArray()
    val len = S.length
    var stIx = 0
    var i = 0
    var j = 0
    val stack = IntArray(len + 1)
    while (i < len) {
        if (ans[i] == ')') if (stIx > 0) stIx-- else ans[i] = '_' else if (ans[i] == '(') stack[stIx++] = i
        i++
    }
    i = 0
    stack[stIx] = -1
    stIx = 0
    while (j < len) {
        if (j == stack[stIx]) stIx++ else if (ans[j] != '_') ans[i++] = ans[j]
        j++
    }
    return String(ans, 0, i)
}