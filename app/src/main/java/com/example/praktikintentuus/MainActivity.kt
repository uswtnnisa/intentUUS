package com.example.praktikintentuus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button: Button = findViewById(R.id.Button)
        val Button2: Button=findViewById(R.id.Button2)

        Button.setOnClickListener{
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        Button2.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}