package com.example.sample

// 상속
// 같은 파일 내에 있어도 자바처럼 상속을 못하기 대문에
// 상속 받으려는 클래스 앞에 open을 작성해야 한다.
open class Human (val name: String ="Anonymous"){
    open fun singAsong() {
        println("lalala")
    }
}

class Korean : Human() {

    // 오버라이드를 이용하여 상속받은 함수의 내용을 변경할 수 있다
    // 그 대신 해당 함수의 앞에도 반드시 [open]이 있어야 한다
    override fun singAsong() {
        super.singAsong()
        println("라라라")
        println("My name is : ${name}")
    }
}

fun main() {

    val korean = Korean()
    korean.singAsong()

}