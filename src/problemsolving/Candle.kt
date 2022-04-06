fun main() {
    val candlesCount = readLine()!!.trim().toInt()
    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val result = birthdayCakeCandles(candles)
    println(result)
}


fun birthdayCakeCandles(candles: Array<Int>): Int {
    var tallest = 0
    var counter = 0

    for (candle in candles) {
        if (candle > tallest) tallest = candle
    }

    for (candle in candles) {
        if (candle == tallest) counter += 1
    }

    return counter
}