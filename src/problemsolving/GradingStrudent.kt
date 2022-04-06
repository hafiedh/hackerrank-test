fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val finalGrade: MutableList<Int> = arrayListOf()
    for (i in grades.indices) {
        if (grades[i] in 38..100) {
            if (grades[i] % 5 > 2) {
                val result = grades[i] + (5 - grades[i] % 5)
                finalGrade.add(result)
            } else {
                finalGrade.add(grades[i])
            }
        } else {
            println("Grading not valid")
        }

    }
    return finalGrade.toTypedArray()
}