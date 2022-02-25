package com.example.emptyactivity1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.emptyactivity1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val submit = binding.submit

        submit.setOnClickListener {
            val data = Intent(this, SecondActivity::class.java).apply {
                putExtra(KEY_STUDENT, Student(Name = "Вадим", Age = 91, CourseNumber = 80))
            }
            startActivity(data)
        }
    }

    companion object {
        const val KEY_STUDENT = "student"
    }
}