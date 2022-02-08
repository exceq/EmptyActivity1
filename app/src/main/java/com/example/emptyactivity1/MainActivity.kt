package com.example.emptyactivity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "Hello world!"
        val student = Student(Name = "Вадим", Age = 91, CourseNumber = 80)
        print(student.toString())
    }
}