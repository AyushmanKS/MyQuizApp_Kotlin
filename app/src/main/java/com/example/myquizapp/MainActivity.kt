package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // To hide taskbar of device
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        var et_name: EditText

        // Input text Validation
        findViewById<Button>(R.id.btn_start).setOnClickListener {
            et_name = findViewById(R.id.et_name)

            if(et_name.text.toString().isEmpty()) {
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show()
            }
            else {
                // Navigating to QuizQuestionsActivity
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                // Sending info through intent
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())

                startActivity(intent)
                finish()
            }
        }
    }
}