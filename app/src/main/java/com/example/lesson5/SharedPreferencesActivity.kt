package com.example.lesson5

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SharedPreferencesActivity : AppCompatActivity() {

    private lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        prefs = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        prefs.edit().putBoolean("isAuth", true).apply()
        prefs.edit().putString("token", "12312312312541258yefsndfhws").apply()



        val isAuth = prefs.getBoolean("isAuth", false)
        Log.d("TAG", "onCreate:  sharedprefs is $isAuth)")
    }
}