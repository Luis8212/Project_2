package com.example.project_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

// attributes
lateinit var textresult : TextView
lateinit var btnexit : Button
class Results : AppCompatActivity() {
    // to get the data from the other activities
        var resultext = " "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        // to place the results
        textresult = findViewById(R.id.resultant)
        btnexit = findViewById(R.id.buttonexit)

        // results
        resultext = intent.getStringExtra("lquestion").toString()

        // having the new result
        var lastresult = resultext

        // setting the result in the textview
        textresult.setText(lastresult)

        // listener to stop the app
        btnexit.setOnClickListener { exit() }


//        q5 = intent.getStringExtra("lquestion").toString()
//        Log.d("DDDDD", q5)
//        // getting the values from the other activities
//        q1 = intent.getStringExtra("fquestion").toString()
//        q2 = intent.getStringExtra("squestion").toString()
//        q3 = intent.getStringExtra("tquestion").toString()
//        q4 = intent.getStringExtra("ffquestion").toString()
//
//
//        // getting from the xml file
//
//        textfq = findViewById(R.id.resultq1)
//        textsq = findViewById(R.id.resultq2)
//        texttq = findViewById(R.id.resultq3)
//        textffq = findViewById(R.id.resultq4)
//         findViewById<TextView>(R.id.resultq5).text=("You choooooose: " + q5)
//
//        // setting the values for the user
//
//        textfq.setText("You chose: " + q1)
//        textsq.setText("You chose: " + q2)
//        texttq.setText("You chose: " + q3)
//        textffq.setText("You chose: " + q4)
   }

    fun exit(){

        finish()
    }

}