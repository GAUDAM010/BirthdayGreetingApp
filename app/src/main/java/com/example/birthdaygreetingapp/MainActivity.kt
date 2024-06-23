package com.example.birthdaygreetingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val birthdayButton: Button = findViewById(R.id.birthdayButton)
        birthdayButton.setOnClickListener {
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            startActivity(intent)
        }
    }
}
