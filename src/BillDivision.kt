

fun main(){
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}

private fun bonAppetit(bill: Array<Int>, k: Int, b: Int) {
    val sum = bill.sum()
    val actual = sum - bill[k]
    val expected = actual / 2
    if (expected == b) {
        println("Bon Appetit")
    } else {
        println(b - expected)
    }
}


