package com.example.project_2

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.example.project_2.databinding.ActivityLogInBinding
import com.example.project_2.databinding.ActivityMainBinding

// attributes
lateinit var frgroup : RadioGroup
lateinit var btnfq : Button

class Question1 : AppCompatActivity() {

    // getting the data from the last activity
    var curroutput = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        // attributes from the xml file
        frgroup = findViewById(R.id.radiogroupfirst)
        btnfq = findViewById(R.id.btnfirst)

        // CHANGING THE BACKGROUND TO GREEN WHEN A BUTTON IS CLICKED
        frgroup.setOnCheckedChangeListener { radioGroup, i ->

            if (frgroup.checkedRadioButtonId == R.id.radioButton1) {
                findViewById<RadioButton>(R.id.radioButton2).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton3).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton4).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton1).setBackgroundColor(Color.GREEN)
            }

            if (frgroup.checkedRadioButtonId == R.id.radioButton2) {
                findViewById<RadioButton>(R.id.radioButton1).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton3).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton4).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton2).setBackgroundColor(Color.GREEN)
            }

            if (frgroup.checkedRadioButtonId == R.id.radioButton3) {
                findViewById<RadioButton>(R.id.radioButton1).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton2).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton4).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton3).setBackgroundColor(Color.GREEN)

            }

            if (frgroup.checkedRadioButtonId == R.id.radioButton4) {
                findViewById<RadioButton>(R.id.radioButton1).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton2).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton3).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton4).setBackgroundColor(Color.GREEN)
            }


        }

        // handler for the button
        btnfq.setOnClickListener { confirmation() }

    }

    fun confirmation(){

        // giving values to the buttons

        var answer = when (frgroup.checkedRadioButtonId){
            R.id.radioButton3 -> "Washington D.C"
            R.id.radioButton1 -> "Albany"
            R.id.radioButton2 -> "New York"
            else -> "California"

        }

        // dialog to check if the user wishes to continue
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Submit your answer?")
        builder.setPositiveButton(R.string.Yes, DialogInterface.OnClickListener{dialog, id ->

            // Toast to let the user know how much they won
            Toast.makeText(this, "You chose: " + answer, Toast.LENGTH_LONG ).show()
            //Toast to le them knoww the real answers
           // Toast.makeText(this,"Correct answer was: Washington D.C", Toast.LENGTH_LONG).show()
            //going to the next activity
            val inintn = Intent(this@Question1, Question2::class.java)
            inintn.putExtra("fquestion", answer)
            startActivity(inintn)
            // putting the value in the next activity

        })
        // builder for the no
        builder.setNegativeButton(R.string.No, null)
        //showing the alert box
        builder.show()

    }
}