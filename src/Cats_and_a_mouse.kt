import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}

fun catAndMouse(x: Int, y: Int, z: Int): String {
    var result: String = if (abs(z-x) > abs(z-y)){
        "Cat B"
    }else if (abs(z-x) < abs(z-y)){
        "Cat A"
    }else{
        "Mouse C"
    }
    return result
}



