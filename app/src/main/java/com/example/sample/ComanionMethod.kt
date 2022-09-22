package com.example.sample

// companion이란 자바의 static 대신에 정적인 메서드 정의

class Book private constructor(val id : Int, val name : String) {   // 다른 곳에서는 생성하지 못하게 막음

    companion object BookFactory : IdProvider{

        override fun getId() : Int {
            return 444
        }

        val myBook = "new book"

        fun create() = Book(0, myBook)
    }

}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.create()

    val bookId = Book.BookFactory.getId()

    println("${book.id } ${book.name}")
}