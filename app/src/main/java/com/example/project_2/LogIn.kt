package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// attributes

lateinit var usern : EditText
lateinit var userp : EditText
lateinit var btnlo : Button

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        // getting the values from the xml file
        usern = findViewById(R.id.username2)
        userp = findViewById(R.id.userpassword2)
        btnlo = findViewById(R.id.buttonlog)

        // Listener for the button
        btnlo.setOnClickListener { moveToRules() }

    }

    fun moveToRules(){

        // making sure everything is not blank
        if (usern.text.toString().isNotBlank()
            && userp.text.toString().isNotBlank()){

            Toast.makeText(this,"Successfully Logged in", Toast.LENGTH_LONG).show()
            val intetn = Intent(this@LogIn, Rules::class.java)
            startActivity(intetn)

        // something is blanck
    } else
        if(usern.text.toString().isBlank()){

            Toast.makeText(this,"Please enter your username", Toast.LENGTH_LONG).show()
        }
        if (userp.text.toString().isBlank()){

            Toast.makeText(this,"Please enter your Password", Toast.LENGTH_LONG).show()
        }

        }
}