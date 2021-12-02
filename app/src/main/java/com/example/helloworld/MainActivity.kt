package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickShowColor=findViewById<TextView>(R.id.clickColor)
        val clickRed=findViewById<TextView>(R.id.clickButtonRed)
        val clickGreen=findViewById<TextView>(R.id.clickButtonGreen)
        val clickBlue=findViewById<TextView>(R.id.clickButtonBlue)
        clickRed.setOnClickListener{
                  clickShowColor.text="Red was clicked"
        }
        clickGreen.setOnClickListener{
            clickShowColor.text="Green was clicked"
        }
        clickBlue.setOnClickListener{
            clickShowColor.text="Blue was clicked"
        }
    }
}