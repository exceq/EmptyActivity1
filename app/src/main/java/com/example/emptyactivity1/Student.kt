package com.example.emptyactivity1

import java.io.Serializable

data class Student(
    val Name: String,
    var Age: Int,
    var CourseNumber: Int
) : Serializable{
    override fun toString(): String {
        return "Hello! My name is $Name. I am $Age years old and studying for $CourseNumber years."
    }
}
