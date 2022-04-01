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


// 5 -> SSSSSH -> LINE 1 , SPACE 5 , HASHTAG 1
// 4 -> SSSSHH -> LINE 2 , SPACE 4 , HASHTAG 2
// 3 -> SSSHHH -> LINE 3 , SPACE 3 , HASHTAG 3


// for (i in 0..n-1) {
//  for (m in 0..n-1-1){
// }