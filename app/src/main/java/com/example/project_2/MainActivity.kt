package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       supportActionBar?.hide() // hiding the support bar

        // handler for the splash screen

        Handler().postDelayed({
            val intnt = Intent(this@MainActivity, LogOrRegister::class.java) // intent
            startActivity(intnt) // starting the intent
            finish() // making sure the user does not go back
        }, 3000) // after 3 seconds, mode to the next page

    }

   // private fun MoveRL(){

      //  val delay = thread {
         //   Thread.sleep(3000)
         //   val intnt = Intent(this@MainActivity, LogOrRegister::class.java)
         //   startActivity(intnt)
           // finish()
       // }
      //  delay.start()
  //  }
}