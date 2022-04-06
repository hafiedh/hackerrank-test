
import java.text.SimpleDateFormat
import java.util.*


fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}

private fun dayOfProgrammer(year: Int): String {
    var answerDate: String? = ""
    val ca = Calendar.getInstance()
    if (year < 1918 && year % 100 == 0) {
        answerDate = getAnswerDate(ca, year, 255)
    } else if (year == 1918) {
        answerDate = getAnswerDate(ca, year, 269)
    } else {
        answerDate = getAnswerDate(ca, year, 256)
    }
    return answerDate
}

private fun getAnswerDate(calendar: Calendar, year: Int, day: Int): String {
    calendar.set(Calendar.YEAR, year)
    calendar.set(Calendar.DAY_OF_YEAR, day)
    val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
    return simpleDateFormat.format(calendar.time)
}