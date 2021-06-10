package com.techlads.logutilexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techlads.logutil.LogUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LogUtil.LogD("MAINACTIVITY", "Logged with internal .aar file")
        LogUtil.LogE("MAINACTIVITY", "Logged with internal .aar file")
        LogUtil.LogW("MAINACTIVITY", "Logged with internal .aar file")
    }
}