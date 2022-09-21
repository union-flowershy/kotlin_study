package com.example.sample

// Lamda
// 1. 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 2. 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 3. return 값으로 사용할 수 있다

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number * number}

val nameAge =  {name : String, age : Int -> "My name is ${name}, I'm ${age}"}

fun main() {

    println(square(12))
    println(nameAge("박준규", 35))

}