package com.example.foodorderingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.Toast
import com.google.firebase.firestore.auth.User
import android.view.LayoutInflater
//import com.example.FoodOrderingApp.databiniding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
//import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var user: EditText
    lateinit var pass: EditText
    lateinit var repass: EditText
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user=findViewById(R.id.user)
        pass=findViewById(R.id.pass)
        repass=findViewById(R.id.repass)
        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)

        title = "Food Ordering App"
        val context = this
        val db = DBHelper(context)
        btn1.setOnClickListener {

            if(!user.text.toString().isNotEmpty() ||
                !pass.text.toString().isNotEmpty() ||
                !repass.text.toString().isNotEmpty() )
            {
                Toast.makeText(context, "Please Fill All Data's!", Toast.LENGTH_SHORT).show()
            }
            else if(pass.text.toString()!=repass.text.toString())
            {
                Toast.makeText(context, "re-entered password does't match!", Toast.LENGTH_SHORT).show()
            }
            else{
                val userx = Users(user.text.toString(), pass.text.toString())                        //User(user.text.toString(), pass.text.toString())
                if(db.insertData(userx) == 1)
                {
                    Toast.makeText(context, "signed in succesfully", Toast.LENGTH_SHORT).show()
                    val myIntent = Intent(this@MainActivity, Home::class.java)
                    var user1 : String = user.text.toString()
                    myIntent.putExtra("mytext", user1)
                    startActivity(myIntent)
                    clearField()
                }
                else
                {
                    Toast.makeText(context, "username already taken", Toast.LENGTH_SHORT).show()
                    pass.text.clear()
                    repass.text.clear()
                }
            }
        }
        btn2.setOnClickListener{
            val myIntent = Intent(this@MainActivity, sign_in_activity::class.java)
            //myIntent.putExtra("mytext", editText.text.toString())
            startActivity(myIntent)

        }
    }
    private fun clearField() {
        user.text.clear()
        pass.text.clear()
        repass.text.clear()
    }
}