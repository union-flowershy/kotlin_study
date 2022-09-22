package com.example.sample

// Lamda
// 1. 람다식이란 이름이 없어도 함수 역할을 하는 익명 함수 하나의 형태이다
// 2. 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 3. return 값으로 사용할 수 있다
// 4. 람다식은 화살 표기법을 사용한다

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}


val square : (Int) -> (Int) = {number -> number * number}

val nameAge =  {name : String, age : Int -> "My name is ${name}, I'm ${age}"}

fun main() {
    println(square(12))
    println(nameAge("박준규", 35))
    println(square(5))

    // 이름 없는 함수 형태
    val multi = { x : Int , y : Int -> x * y }
    println(multi(10, 20))
    val multi2 : (Int, Int) -> Int = {x : Int , y : Int -> x * y }

    // 람다식 안에 람다식이 있는 경우
    val nestedLambda : () -> () -> Unit = { {println("nested")}}

    // 반환값이 없거나 매개변수가 하나만 있을 경우
    val greet : () -> Unit
    val square : (Int) -> Int = { x -> x * x}

    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGrea())
    println(b.pizzaIsGrea())

    println(extendString("ariana", 35))

    println(calculateGrade(70))
}

// 확장함수
val pizzaIsGrea : String.() -> String = {this + "Pizza is the best!"}

fun extendString(name : String, age: Int) : String  {

    val introduceMySelf : String.(Int) -> String = { "I am ${this} and ${it}  years old"} // 파라미터를 한 개만 가르키는 경우 it으로 생략이 가능하다

    return name.introduceMySelf(age)
}

// 람다의 Return
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean {
    return lambda(5.2343)
}