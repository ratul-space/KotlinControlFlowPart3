package com.example.kotlincontrolflowpart3

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate: starts")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..7) {
            if (i == 3) {
                break
            }
            Log.d(TAG, "i =" + i)

        }


        Log.d(TAG, "onCreate: ends")
    }
}