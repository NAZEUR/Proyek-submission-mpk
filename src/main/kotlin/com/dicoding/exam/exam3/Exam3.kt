package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    val dataType = when (args) {
        is Int -> "Integer"
        is String -> "String"
        is Boolean -> "Boolean"
        is Double -> "Double"
        is List<*> -> "List"
        is Map<*, *> -> "Map"
        else -> "Unknow"
    }
    return "Yes! it's $dataType"
}
