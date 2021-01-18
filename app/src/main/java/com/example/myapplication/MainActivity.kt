package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val one: Button = findViewById(R.id.button1)
        val two: Button = findViewById(R.id.button2)
        val three: Button = findViewById(R.id.button3)

        one.setOnClickListener {
            Log.e("FindMe","Button 1 clicked");
        }
        two.setOnClickListener {
            Log.e("FindMe","Button 2 clicked");
        }
        three.setOnClickListener {
            Log.e("FindMe","Button 3 clicked");
        }
    }
}