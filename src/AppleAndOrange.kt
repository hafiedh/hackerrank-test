fun main() {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    var appleOnHouse = 0
    var orangeOnHouse = 0

    for(apple in apples.indices) {
        val item = apples[apple]
        val applePosition = a + item
        println(applePosition)
        if (applePosition in s..t){
            appleOnHouse += 1
        }
    }

    for(orange in oranges.indices) {
        val item = oranges[orange]
        val orangePosition = b + item
        if (orangePosition in s..t){
            orangeOnHouse += 1
        }
    }

//    println(appleOnHouse)
//    println(orangeOnHouse)
}