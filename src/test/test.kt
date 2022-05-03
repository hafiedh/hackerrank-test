package test

fun main(){
    isPalindrome("racecar")
}


// palindrome checker
private fun isPalindrome(str: String) {
    var reversed = ""
    for (i in str.length - 1 downTo 0) {
        reversed += str[i]
    }
    if (str == reversed) {
        println("$str is a palindrome")
    } else {
        println("$str is not a palindrome")
    }
}