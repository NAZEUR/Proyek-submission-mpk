package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val numberString = number.toString()
    require(numberString.length in 2..9) { "Inputs must have a length between 2 to 9" }

    val digits = numberString.map { it.toString().toInt() }
    val minDigit = digits.minOrNull() ?: throw IllegalArgumentException("No Digit")
    val maxDigit = digits.maxOrNull() ?: throw IllegalArgumentException("No Digit")

    return minDigit + maxDigit
}
