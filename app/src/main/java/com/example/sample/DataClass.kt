package com.example.sample


// 비행기로 예
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

// 데이터 클래스를 이용하면 하단의 내용을 컴파일러가 자동으로 생성해준다
// ttoString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket("KoreanAir", "joyceHone", "2022-09-26", 14)
    val ticketB = TicketNormal("KoreanAir", "joyceHone", "2022-09-26", 14)

    println(ticketA)
    println(ticketB)
}