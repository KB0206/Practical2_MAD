package com.example.practical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "No resume function called",
            Toast.LENGTH_LONG).show()
        Toast.makeText(applicationContext, "function called",
            Toast.LENGTH_LONG).show()
    }
}