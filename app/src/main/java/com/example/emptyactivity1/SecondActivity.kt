package com.example.emptyactivity1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.emptyactivity1.MainActivity.Companion.KEY_STUDENT

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val stud = intent?.getSerializableExtra(KEY_STUDENT)
        val textInfo = findViewById<TextView>(R.id.text_info)
        textInfo.text = stud.toString()
    }
}