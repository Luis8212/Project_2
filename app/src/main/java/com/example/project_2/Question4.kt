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
lateinit var rgroup4 : RadioGroup
lateinit var btn4 : Button

class Question4 : AppCompatActivity() {

    // new output
    var curroutput4 = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        // attributes from the xml file
        rgroup4 = findViewById(R.id.radiogroupfourth)
        btn4 = findViewById(R.id.btnfourth)

        // new output populated
        curroutput4 = intent.getStringExtra("tquestion").toString()

        // checking
        rgroup4.setOnCheckedChangeListener { radioGroup, i ->

            if (rgroup4.checkedRadioButtonId == R.id.radioButton41) {
                findViewById<RadioButton>(R.id.radioButton42).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton43).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton44).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton41).setBackgroundColor(Color.GREEN)
            }

            if (rgroup4.checkedRadioButtonId == R.id.radioButton42) {
                findViewById<RadioButton>(R.id.radioButton41).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton43).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton44).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton42).setBackgroundColor(Color.GREEN)
            }

            if (rgroup4.checkedRadioButtonId == R.id.radioButton43) {
                findViewById<RadioButton>(R.id.radioButton41).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton42).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton44).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton43).setBackgroundColor(Color.GREEN)

            }

            if (rgroup4.checkedRadioButtonId == R.id.radioButton44) {
                findViewById<RadioButton>(R.id.radioButton41).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton42).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton43).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton44).setBackgroundColor(Color.GREEN)
            }

        }

        btn4.setOnClickListener { fourthq() }
    }

    fun fourthq(){

        // giving values to the buttons

        var answer4 = when (rgroup4.checkedRadioButtonId){
            R.id.radioButton41 -> "November 14"
            R.id.radioButton42 -> "December 9"
            R.id.radioButton43 -> "March 20"
            else -> "April 18"

        }

        // alert box
        val builder4 = AlertDialog.Builder(this)
        builder4.setTitle("Submit your answer?")
        builder4.setPositiveButton(R.string.Yes, DialogInterface.OnClickListener{ dialog, id ->

            // Toast to let the user know how much they won
            Toast.makeText(this, "You chose: " + answer4, Toast.LENGTH_LONG ).show()
            // new output
            var newoutput4 = "\n" + curroutput4 + " \n" + answer4
            val inintn4 = Intent(this@Question4, Question5::class.java)
            // putting the value in the next activity
            inintn4.putExtra("ffquestion", newoutput4)
            startActivity(inintn4)


        })
        // builder for the no
        builder4.setNegativeButton(R.string.No, null)
        //showing the alert box
        builder4.show()


    }
}