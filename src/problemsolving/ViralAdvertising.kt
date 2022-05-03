package problemsolving

fun viralAdvertising(n: Int): Int {
    var people = 5
    var liked = 2
    var cumulative = 2
    // Write your code here
    for (i in 1 until n){
        people = liked * 3
        liked = people / 2
        cumulative += liked
    }
    return cumulative
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
