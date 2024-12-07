package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Home : AppCompatActivity() {
    lateinit var usertv: TextView
    lateinit var btn1: Button
    lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usertv = findViewById(R.id.user)
        val str02 = intent.getStringExtra("mytext")
        //val str02=intent.getStringExtra("mytext")
        val str03 = "Name is $str02"
        usertv.text = str03
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        val context = this
        btn1.setOnClickListener {
            //Toast.makeText(context, "Sign in successful!", Toast.LENGTH_SHORT).show()
            val myIntent = Intent(this@Home, order1::class.java)
            var user1 = usertv.text
            myIntent.putExtra("mytext", str02)
            startActivity(myIntent)
        }
        btn2.setOnClickListener {
            //Toast.makeText(context, "Sign in successful!", Toast.LENGTH_SHORT).show()
            val myIntent = Intent(this@Home, MainActivity::class.java)
            var user1 = usertv.text
            myIntent.putExtra("mytext", str02)
            startActivity(myIntent)
        }
    }
}