package com.example.foodorderingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class sign_in_activity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var user: EditText
    lateinit var pass: EditText
    lateinit var btn2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        user = findViewById(R.id.username_et)
        pass = findViewById(R.id.password_et)
        btn1 = findViewById(R.id.login_btn)
        btn2 = findViewById(R.id.btn2)
//416
        title = "Food Ordering App"
        val context = this
        val db = DBHelper(context)
        btn1.setOnClickListener {
            if (db.checkuserentry(user.text.toString(), pass.text.toString()) == 1) {
                Toast.makeText(context, "Sign in successful!", Toast.LENGTH_SHORT).show()
                val myIntent = Intent(this@sign_in_activity, Home::class.java)
                var user1: String = user.text.toString()
                myIntent.putExtra("mytext", user1)
                //var a=50
                //myIntent.putExtra("mytext", a.toString())
                startActivity(myIntent)
            } else {
                Toast.makeText(context, "Username or password didn't match!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        btn2.setOnClickListener {
            val myIntent = Intent(this@sign_in_activity, MainActivity::class.java)
            startActivity(myIntent)


        }
    }

}