package com.example.sample

// 코틀린은 파일 이름과 클래스 이름이 동일할 필요가 없다

// 자바에서는 생성자를 이용할때는 Human() { }로 생성하지만
// 코틀린에서는 클래스 옆에 constructor([변수명], [타입])을 이용한다
// 또 한, constructor을 이용 안하고 바로 (val name : String)으로도 가능하다
// 기본 생성자 디폴드 값도 아래처럼 입력할 수 있다
open class Human (val name: String ="Anonymous"){

//    // 부생성자 constructor는 항상 주 생성자에게 부여받아야 하기 때문에 this를 이용한다
//    constructor(name : String, age: Int) : this(name) {
//        println("my name is ${name}, ${age}")
//    }
//
//    init {  // init은 주 생성자의 일부라 부생성자 constructor보다 먼저 진행됨
//        println("New human has been born!!")
//    }
//
//    fun eatingCoke() {
//        println("This is so YUMMMMYYY~~~")
//    }

    open fun singAsong() {
        println("lalala")
    }

}

// 상속
// 같은 파일 내에 있어도 자바처럼 상속을 못하기 대문에
// 상속 받으려는 클래스 앞에 open을 작성해야 한다.
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

//    val human = Human("JJKKYY") // 자바에서는 new를 이용하지만 코틀린은 생략
//
//    val stranger = Human()  // 이렇게 생성자를 이용할 수 있다. 디폴트값을 설정하였기 때문
//
//    human.eatingCoke()
//
//    val mon = Human("PPP", 35)
//
//    println("this human's name is ${human.name}")
//    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singAsong()

}