package test

import java.lang.Math.pow
import java.util.*
import kotlin.math.pow

fun main(args : Array<String>) {
    println(passwordValidationWithRegex("KoinWorks@123"))
}

// regex not containing string "kotlin"
fun passwordValidationWithRegex(string: String): Boolean {
    return !string.contains("koinworks", true)
}