package com.example.project_2

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog

// Attributes
lateinit var check1 : CheckBox
lateinit var check2: CheckBox
lateinit var check3 : CheckBox
lateinit var check4 : CheckBox

lateinit var btn3 : Button

class Question3 : AppCompatActivity() {
    // new output
    var curroutput3 = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        // new output populated
        curroutput3 = intent.getStringExtra("squestion").toString()

        // attributes from the xml file
        check1 = findViewById(R.id.checkbox1)
        check2 = findViewById(R.id.checkbox2)
        check3 = findViewById(R.id.checkbox3)
        check4 = findViewById(R.id.checkbox4)
        btn3 = findViewById(R.id.btnthrid)

        btn3.setOnClickListener { thirdq() }
    }

    fun thirdq (){

        var answer3 = " "

        // giving values to the checkboxes when clicked
        if (check1.isChecked()){
             answer3 += check1.text

        }
        if (check2.isChecked){
             answer3 += " " + check2.text
        }
        if (check3.isChecked){
                answer3 += " " + check3.text
        }
        if (check4.isChecked){
            answer3 += " " + check4.text
        }

        // dialog to check if the user wishes to continue
        val builder3 = AlertDialog.Builder(this)
        builder3.setTitle("Submit your answer?")
        builder3.setPositiveButton(R.string.Yes, DialogInterface.OnClickListener{ dialog, id ->

            // Toast to let the user know how much they won
            Toast.makeText(this, "You chose: " + answer3, Toast.LENGTH_LONG ).show()
            // new output
            var newoutput3 = "\n" + curroutput3 + " \n" + answer3
            // intent
            val inintn3 = Intent(this@Question3, Question4::class.java)
            // putting the value in the next activity
            inintn3.putExtra("tquestion", newoutput3)
            startActivity(inintn3)

        })
        // builder for the no
        builder3.setNegativeButton(R.string.No, null)
        //showing the alert box
        builder3.show()

    }
}