package com.example.lesson5

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TimePicker
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.Comparator

class MainActivity : AppCompatActivity(), TimePickerDialog.OnTimeSetListener {
    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main2.setOnClickListener {
            val intent = Intent("ithub.action.time")
            startActivity(intent)
        }

        main3.setOnClickListener {
            val intent = Intent("ithub.action.date")
            startActivity(intent)
        }

        dialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("title")
                .setCancelable(true)
                .setMessage("Точно хотите выйти")
                .setPositiveButton("ok", null)
                .setNegativeButton("cancel", null)
                .show()
        }


        datePicker.setOnClickListener {
            val datePicker = TimePickerDialog(this@MainActivity,this, 0, 0 ,true)
            datePicker.show()
        }

        sharedPrefs.setOnClickListener {
            startActivity(Intent(this, SharedPreferencesActivity::class.java))
        }


        val prefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        Log.d(TAG, "main activity onCreate:${prefs.getBoolean("isAuth", false)} ")

    }
    private val TAG = "MainActivity"
    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {
        Log.d(TAG, "onTimeSet() called with:, p1 = $p1, p2 = $p2")
    }
}