package com.example.lesson5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity3 : AppCompatActivity() {


    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val sdf = SimpleDateFormat("HH:mm:ss")
        val time: String = sdf.format(Date(System.currentTimeMillis()))
        timeTV.text = time
    }
}