package test

fun main() {
    val s = readLine()!!

    val result = getPhoneNumber(s)

    println(result)
}

// get phone number from string s
fun getPhoneNumber(s: String): String {
    var result = ""
    val splitBySpace = s.split(" ")

    for (i in splitBySpace.indices) {
        when (splitBySpace[i]) {
            "double" -> result += checkingRepeating(splitBySpace[i + 1], 2)
            "triple" -> result += checkingRepeating(splitBySpace[i + 1], 3)
            "zero" -> result += "0"
            "one" -> result += "1"
            "two" -> result += "2"
            "three" -> result += "3"
            "four" -> result += "4"
            "five" -> result += "5"
            "six" -> result += "6"
            "seven" -> result += "7"
            "eight" -> result += "8"
            "nine" -> result += "9"
        }
    }
    return result
}

// check repeating number string
private fun checkingRepeating(s: String, times: Int): String {
    var resultSub = ""
    return if (times == 2) {
        for (i in 0 until times-1) {
            when (s) {
                "zero" -> resultSub += "0"
                "one" -> resultSub += "1"
                "two" -> resultSub += "2"
                "three" -> resultSub += "3"
                "four" -> resultSub += "4"
                "five" -> resultSub += "5"
                "six" -> resultSub += "6"
                "seven" -> resultSub += "7"
                "eight" -> resultSub += "8"
                "nine" -> resultSub += "9"
            }
        }
        resultSub
    } else {
        for (i in 0 until times-1) {
            when (s) {
                "zero" -> resultSub += "0"
                "one" -> resultSub += "1"
                "two" -> resultSub += "2"
                "three" -> resultSub += "3"
                "four" -> resultSub += "4"
                "five" -> resultSub += "5"
                "six" -> resultSub += "6"
                "seven" -> resultSub += "7"
                "eight" -> resultSub += "8"
                "nine" -> resultSub += "9"
            }
        }
        resultSub
    }
}
