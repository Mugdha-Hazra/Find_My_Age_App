package com.example.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         buGetAge.setOnClickListener {
             buUserAgeClick()
         }
    }

    fun buUserAgeClick(){
        val userDob:Int = Integer.parseInt(editTextDate.text.toString())
        val currYear:Int = Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYears:Int = currYear-userDob
        textViewShow.text ="Your Age Is $userAgeInYears Years"
    }
}
