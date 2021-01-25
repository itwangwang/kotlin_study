package com.itwang.kotlin.quickstarts

fun main() {
    println("hello")
    hello()
    println(hello1("hello"))
}

//函数定义
//empty argument and have return
fun hello():String{
    return "hello"
}

//have argument and have return
fun hello1(s:String) = s