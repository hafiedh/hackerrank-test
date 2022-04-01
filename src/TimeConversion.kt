

fun main(){
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}

fun timeConversion(s: String): String {
    val getZone = s.substring(8, 9)
    val getTime = s.substring(0, 8)
    val getHour = s.substring(0, 2)
    val getMinutes = s.substring(2, 8)

    return if (getZone == "A") {
        if (getHour == "12") "00$getMinutes" else getTime
    } else {
        val sum = getHour.toInt() + 12
        if (getHour == "12") getTime else "$sum$getMinutes"
    }
}