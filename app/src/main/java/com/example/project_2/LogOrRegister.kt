package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// declaring the attributes
lateinit var btnr : Button
lateinit var btnl : Button

class LogOrRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_or_register)

        // getting the buttons from the xml file
        btnr = findViewById(R.id.register)
        btnl = findViewById(R.id.login)

        // defining to when the buttons are clicked

        btnr.setOnClickListener { register() }
        btnl.setOnClickListener { loggin() }

    }

    // function to go to the register activity
    fun register(){

        val intnt = Intent(this@LogOrRegister, Registration::class.java)
        startActivity(intnt)
    }

    // function to go to the log in activity
    fun loggin(){

        val intnt2 = Intent(this@LogOrRegister, LogIn::class.java)
        startActivity(intnt2)
    }
}