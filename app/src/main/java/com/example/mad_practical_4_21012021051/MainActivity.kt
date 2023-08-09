package com.example.mad_practical_4_21012021051

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var login: button = findViewById<Button>(R.id.button)
        var sign : button =findViewById<Button>(R.id.button2)

        login.setOnClickListener{
            intent(this@MainActivity,LoginActivity::class.java).also{
               startActivity(it)
            }
        }
    }

}