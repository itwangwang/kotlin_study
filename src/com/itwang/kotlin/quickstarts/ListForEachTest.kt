package com.itwang.kotlin.quickstarts

import java.util.function.Consumer

fun main() {
    var list:List<String> = listOf<String>("hello","hi")

    list.forEach(Consumer {
        println(it)
    })

    list.forEach {
        println(it)
    }
}