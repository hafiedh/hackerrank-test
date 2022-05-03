package test

fun main(){
   binarySquare(5)
}

fun binarySquare(n: Int) {
    for (i in 0..n) {
        for (j in 0..n) {
            print(if ((i + j and 1) == 0) "0" else "1")
        }
        println()
    }
}

// i = 0, j = 0,1,2,3,4
// i = 1, j = 0,1,2,3,4
// i = 2, j = 0,1,2,3,4
// i = 3, j = 0,1,2,3,4
// i = 4, j = 0,1,2,3,4

// 0 0 0 0 0
//