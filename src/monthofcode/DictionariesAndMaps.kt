import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val phoneBook = mutableMapOf<String, String>()

    for (i in 0 until n) {
        val (name, phone) = scan.nextLine().split(" ")
        phoneBook[name] = phone
    }

    while (scan.hasNextLine()) {
        val name = scan.nextLine()
        if (phoneBook.containsKey(name)) {
            println("$name=${phoneBook[name]}")
        } else {
            println("Not found")
        }
    }
}