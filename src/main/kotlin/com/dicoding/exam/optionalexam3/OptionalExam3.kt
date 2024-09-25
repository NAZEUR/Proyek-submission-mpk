package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    require(int in 1..100) { "Integer and String Inputs must be in about 1 to 100" }

    val regex = Regex("\\d+")
    val matchResult = regex.find(str)

    return if (matchResult != null) {
        val numberInString = matchResult.value.toInt()
        val multipliedResult = numberInString * int

        str.replace(matchResult.value, multipliedResult.toString())
    } else {
        "$str$int"
    }
}
