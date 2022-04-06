import java.util.*

private fun regionAndContest(
    maps: Array<Array<String?>>,
    visited: Array<BooleanArray>,
    tempFraction: MutableSet<String?>,
    row: Int,
    col: Int,
    x: Int,
    y: Int
) {
    if (x < 0 || x >= row) {
        return
    }
    if (y < 0 || y >= col) {
        return
    }
    if (visited[x][y]) {
        return
    }
    visited[x][y] = true
    if (maps[x][y] == "#") {
        return
    }
    if (maps.get(x).get(y) != ".") {
        tempFraction.add(maps[x][y])
    }
    regionAndContest(maps, visited, tempFraction, row, col, x, y + 1) // move direction right
    regionAndContest(maps, visited, tempFraction, row, col, x, y - 1) // move direction left
    regionAndContest(maps, visited, tempFraction, row, col, x + 1, y) // move direction up
    regionAndContest(maps, visited, tempFraction, row, col, x - 1, y) // move direction down
    return
}


fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val testCase: Int = input.nextInt()
    for (i in 1..testCase) {
        val row: Int = input.nextInt()
        val col: Int = input.nextInt()
        val maps = Array(row) {
            arrayOfNulls<String>(
                col
            )
        } // map the input string to 2d array
        val visited = Array(row) {
            BooleanArray(
                col
            )
        } // array to store if the node is already visited
        val tempFractions: MutableSet<String?> = HashSet() // using set to store temp fraction
        val fractions: MutableMap<String?, Int?> =
            TreeMap() // using tree map to store fraction by alpahbetical order
        for (j in 0 until row) { // init data
            val str: String = input.next()
            val ch = str.toCharArray()
            for (k in ch.indices) {
                maps[j][k] = ch[k].toString()
                visited[j][k] = false
            }
        }
        var conqu = 0
        for (j in 0 until row) {
            for (k in 0 until col) {
                tempFractions.clear() // reset temp fraction every region check
                regionAndContest(maps, visited, tempFractions, row, col, j, k)
                val tempITR: Iterator<String?> = tempFractions.iterator()
                if (tempFractions.size > 1) { // if set fraction > 1 there's a contest
                    conqu++
                } else { // if set = 1 then store value in set(tempfraction) to fraction
                    while (tempITR.hasNext()) {
                        val frac = tempITR.next()
                        if (fractions[frac] != null) {
                            fractions[frac] = fractions.get(frac)!! + 1
                        } else if (fractions[frac] == null) {
                            fractions[frac] = 1
                        }
                    }
                }
            }
        }
        println("Case $i:")
        for (entry: Map.Entry<String?, Int?> in fractions.entries) {
            val key: String? = entry.key
            val value: Int? = entry.value
            println(key.toString() + " " + value)
        }
        println("contested $conqu")
    }
}