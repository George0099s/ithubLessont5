package com.example.lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        when (intent.action) {
            "ithub.action.time" -> {
                text.text = "time"
            }
            "ithub.action.date" -> {
                text.text = "date"
            }
        }
    }
}