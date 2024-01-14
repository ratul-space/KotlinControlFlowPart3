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
//
//        outerLoop@ for (i in 1..3) {
//            for (j in 1..4) {
//
//                if (i == 2 && j == 2) {
//                    continue@outerLoop
//                }
//                Log.d(TAG, "i = " + i + " j = " + j)
//
//            }
//        }
        var i = 1
        while (i < 6) {
            if (i % 2 == 0) {
                i++
                continue

            }
            Log.d(TAG, "onCreate: i = " + i)
            i++
        }


        Log.d(TAG, "onCreate: ends")
    }
}