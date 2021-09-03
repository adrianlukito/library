package com.adrianlukito.library

import android.util.Log

class LibraryLog {

    companion object {
        private const val TAG = "LibraryLog"

        fun debug(message: String) {
            Log.d(TAG, "message")
        }
    }
}