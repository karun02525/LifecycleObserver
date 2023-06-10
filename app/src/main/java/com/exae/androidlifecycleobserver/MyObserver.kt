package com.exae.androidlifecycleobserver

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyObserver : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("MyObserver", "onCreate: ")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("MyObserver", "onStart: ")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("MyObserver", "onResume: ")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("MyObserver", "onStop: ")
    }

}