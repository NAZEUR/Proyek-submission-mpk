package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): Comparable<*> {
    require(string.length in 1..100) { "String input must be within about 1 to 100" }

    val middleIndex = string.length / 2

    return if (string.length % 2 == 0) {
        string.substring(middleIndex - 1, middleIndex + 1)
    } else {
        string[middleIndex].toString()
    }
}
