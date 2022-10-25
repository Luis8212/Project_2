package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// Button attribute
lateinit var btngtg : Button

class Rules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        // button from the xml file

        btngtg = findViewById(R.id.game)

        // listener to move to the game
        btngtg.setOnClickListener { quiz() }

    }

    // function
    fun quiz(){

        val nintn = Intent(this@Rules, Question1::class.java)
        startActivity(nintn)

    }
}