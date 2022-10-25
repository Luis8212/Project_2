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

lateinit var rgroup5 : RadioGroup
lateinit var btn5 : Button

class Question5 : AppCompatActivity() {
    // new output
    var curroutput5 = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        // from the xml file
        rgroup5 = findViewById(R.id.radiogroupfifth)
        btn5 = findViewById(R.id.btnfifth)

        // new output populated
        curroutput5 = intent.getStringExtra("ffquestion").toString()

        // onclick for the radio button
        rgroup5.setOnCheckedChangeListener { radioGroup, i ->

            if (rgroup5.checkedRadioButtonId == R.id.radioButton51) {
                findViewById<RadioButton>(R.id.radioButton52).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton53).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton54).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton51).setBackgroundColor(Color.GREEN)
            }

            if (rgroup5.checkedRadioButtonId == R.id.radioButton52) {
                findViewById<RadioButton>(R.id.radioButton51).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton53).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton54).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton52).setBackgroundColor(Color.GREEN)
            }

            if (rgroup5.checkedRadioButtonId == R.id.radioButton53) {
                findViewById<RadioButton>(R.id.radioButton51).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton52).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton54).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton53).setBackgroundColor(Color.GREEN)

            }

            if (rgroup5.checkedRadioButtonId == R.id.radioButton54) {
                findViewById<RadioButton>(R.id.radioButton51).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton52).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton53).setBackgroundColor(Color.WHITE)
                findViewById<RadioButton>(R.id.radioButton54).setBackgroundColor(Color.GREEN)
            }

        }

        btn5.setOnClickListener { fifththq() }

    }

    fun fifththq(){

        var answer5 = when (rgroup5.checkedRadioButtonId){
            R.id.radioButton51 -> "George washington"
            R.id.radioButton52 -> "Donald trump"
            R.id.radioButton53 -> "Franklin Roosevelt"
            else -> "Benjamin Franklin"

        }

    //    val answer5 ="Testing"
        val builder5 = AlertDialog.Builder(this)
        builder5.setTitle("Submit your answer?")
        builder5.setPositiveButton(R.string.Yes, DialogInterface.OnClickListener{ dialog, id ->

            // Toast to let the user know how much they won
            Toast.makeText(this, "You chose: " + answer5, Toast.LENGTH_LONG ).show()
            // new output
            var newoutput5 = "\n" + curroutput5 + " \n" + answer5
            //going to the next activity
            val inintn5 = Intent(this@Question5, Results::class.java)
            inintn5.putExtra("lquestion", newoutput5)
            startActivity(inintn5)


        })
        // builder for the no
        builder5.setNegativeButton(R.string.No, null)
        //showing the alert box
        builder5.show()



    }
}