package com.adrianlukito.librarysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrianlukito.library.LibraryLog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LibraryLog.debug("asd")
    }
}