package com.example.project_2

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

// attributes
lateinit var rgsecond : RadioGroup
lateinit var btn2 : Button

class Question2 : AppCompatActivity() {

    // getting the data from the last activity
       var curroutput2 = " "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        // attributes from the xml file
        rgsecond = findViewById(R.id.radiogroupsecond)
        btn2 = findViewById(R.id.btnsecond)

        // new output
        curroutput2=intent.getStringExtra("fquestion").toString()

        // CHANGING THE BACKGROUND TO GREEN WHEN A BUTTON IS CLICKED
        rgsecond.setOnCheckedChangeListener { radioGroup, i ->

            if (rgsecond.checkedRadioButtonId == R.id.radioButton21) {
                findViewById<RadioButton>(R.id.radioButton22).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton23).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton24).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton21).setBackgroundColor(Color.GREEN)
            }

            if (rgsecond.checkedRadioButtonId == R.id.radioButton22) {
                findViewById<RadioButton>(R.id.radioButton21).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton23).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton24).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton22).setBackgroundColor(Color.GREEN)
            }

            if (rgsecond.checkedRadioButtonId == R.id.radioButton23) {
                findViewById<RadioButton>(R.id.radioButton21).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton22).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton24).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton23).setBackgroundColor(Color.GREEN)

            }

            if (rgsecond.checkedRadioButtonId == R.id.radioButton24) {
                findViewById<RadioButton>(R.id.radioButton21).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton22).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton23).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton24).setBackgroundColor(Color.GREEN)
            }

        }

        btn2.setOnClickListener { secondq() }
    }

    fun secondq(){

        // giving values to the buttons

        var answer2 = when (rgsecond.checkedRadioButtonId){
            R.id.radioButton21 -> "July 4"
            R.id.radioButton22 -> "June 23"
            R.id.radioButton23 -> "March 3"
            else -> "July 24"

        }

        // dialog to check if the user wishes to continue
        val builder2 = AlertDialog.Builder(this)
        builder2.setTitle("Submit your answer?")
        builder2.setPositiveButton(R.string.Yes, DialogInterface.OnClickListener{ dialog, id ->

            // Toast to let the user know how much they won
            Toast.makeText(this, "You chose: " + answer2, Toast.LENGTH_LONG ).show()
            // new output
            var newanswer2 = curroutput2 + "\n" + answer2
            //intent
            val inintn2 = Intent(this@Question2, Question3::class.java)
            // putting the value in the next activity
            inintn2.putExtra("squestion", newanswer2)
            startActivity(inintn2)

        })
        // builder for the no
        builder2.setNegativeButton(R.string.No, null)
        //showing the alert box
        builder2.show()

    }
}