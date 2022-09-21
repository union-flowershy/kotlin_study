package com.example.sample

fun main() {
    nullcheck()

    fun maxBy(a: Int, b : Int) : Int {
        if( a > b ) {
            return a
        } else {
            return b
        }
    }
    fun maxBy2(a : Int, b : Int) = if( a > b ) a else b
}

    fun checkNum(score : Int) {
        when(score) {
            0 -> println("this is 0")
            1 -> println("this is 1")
            2,3 -> println("ths is 2 or 3")
            else -> println("I don't know")
        }
        var b : Int = when(score) {
            1 -> 1
            2 -> 2
            else -> 3
        }
        println("b : ${b}")

        when(score) {
            in 90..100 -> println("You are genius")
            in 10..90 -> println("not bad")
        }
    }

// Expression vs Statement
// 코틀린은 모든 함수는 값을 반환하는 Expression으로 생각해야 한다
// 값을 반환하지 않는 것은 Statement

// Expression의 예 - 값을 반환 함
// var a : Int = when(score) {
//    1 -> 1
//    2 -> 2
//    else -> 3
//  }

// Statement - 조건에 따라 내용을 보여줌
// when(score) {
// 0 -> println("this is 0")
// 1 -> println("this is 1")
// }

fun maxBy2(a : Int, b : Int) = if( a > b ) a else b

// 5. Array an List

// Array는 이미 메모리가 지정되서 나옴

// List 1. List(읽기전용), 2. MutableList(읽기,쓰기)에 ArrayList가 있음

fun array() {
    val array : Array<Int> = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0) // list는 인터페이스

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

// 6. For / while

fun forAndWhile() {

    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for(name in students) {
        println("${name}")
    }

    for((index, name) in students.withIndex()) {
        println("${index+1} 번째  학생 : ${name}")
    }

    // for문에서 step [숫자] 부여시 해당 숫자 단위로 계산
    // downTo [숫자]로 할 시 최대 값에서 아래로 숫자가 내려감
    // for( i in 1 until 100)으로 하면 최대값 100은 제외 99까지 for문 진행
    
    var sum : Int = 0
    for(i in 1..10 step 2) {
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10) {
        println("current index :  ${index}" )
        index ++
    }
}

// 7. Nullable / NonNull

fun nullcheck() {
    //NPE : NULL pointer exception

    var name : String = "joyce"

    var nullName : String? = null //  null 타입을 만들땐 뒤에 물음표를 붙인다

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?: 엘비스연산자
    val lastName : String? = null
    val fullName = name + " " + (lastName ?: "No lastName")
                                                     // lastName 값이 있으면 반환 없으면 No lastName 텍스트 반환
    println(fullName)

    // !! 컴파일러한테 말해주는 기능
    fun ignoreNulls(str : String?) {
        val mNotNull : String = str!!  // !!안붙이면 str이 Null일 수 있기 때문에 컴파일러 에러 발생
        val upper = mNotNull.toUpperCase()
    }

    // let은 람다식으로 저장??
    val email : String? = "yxddt12@naver.com"
    email?.let{
        println("my email is ${email}")
    }

    var sum2 : Int? = null
    println("${sum2}")

}