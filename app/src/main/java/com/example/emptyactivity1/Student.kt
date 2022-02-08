package com.example.emptyactivity1

data class Student(
    val Name: String,
    var Age: Int,
    var CourseNumber: Int
){
    override fun toString(): String {
        return "Hello! My name is $Name. I am $Age years old and studying for $CourseNumber years."
    }
}
