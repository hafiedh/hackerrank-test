fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    fizzBuzz(n)
}

private fun fizzBuzz(n: Int) {
    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}