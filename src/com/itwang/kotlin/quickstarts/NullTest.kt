package com.itwang.kotlin.quickstarts

import java.lang.NumberFormatException

fun main() {

}

fun convert2Int(s:String):Int?{
    return try {
        s.toInt()
    } catch (e: NumberFormatException) {
         null
    }
}