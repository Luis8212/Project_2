package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// declaring the attributes
lateinit var userName : EditText
lateinit var fname : EditText
lateinit var ddate : EditText
lateinit var eMail : EditText
lateinit var pasword : EditText
lateinit var btnT : Button

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        // getting the inputs from the xml file

        userName = findViewById(R.id.name)
        fname = findViewById(R.id.family)
        ddate = findViewById(R.id.date)
        eMail = findViewById(R.id.email)
        pasword = findViewById(R.id.password)
        btnT = findViewById(R.id.registrationbtn)

        // listener to when the user clicks the button

        btnT.setOnClickListener { movegame()}


    }

    // function for the button
    fun movegame(){

        // if all requirements are met move to the next activity

        if (userName.text.toString().isNotBlank()
            && userName.text.length >= 3 && userName.text.length <= 30
            && fname.text.toString().isNotBlank()
            && ddate.text.toString().isNotBlank()
            && eMail.text.toString().isNotBlank()
            && pasword.text.toString().isNotBlank()){

            Toast.makeText(this, "Registration successfull, Please log in", Toast.LENGTH_LONG).show()

            val inten = Intent(this@Registration, LogOrRegister::class.java)
            startActivity(inten)

            // else is gonna check which are empty

        } else
            if (userName.text.toString().isBlank()
                || userName.text.length < 3 && userName.text.length > 30){

                userName.setHint("Please enter a valid name")
                Toast.makeText(this, "Name has to be between 3 and 30 characters", Toast.LENGTH_LONG).show()
            }

            if (fname.text.toString().isBlank()){
                fname.setHint("Please enter a valid family name")
            }

            if (ddate.text.toString().isBlank()){
                ddate.setHint("Please enter a valid date")
            }

            if (eMail.text.toString().isBlank() || eMail.text.length < 10){
                eMail.setHint("Please enter a valid email")
                Toast.makeText(this, "Email has to be at least 10 characters", Toast.LENGTH_LONG).show()
                }

            if (pasword.text.toString().isBlank()){
                pasword.setHint("Please enter a valid password")
            }
    }

}