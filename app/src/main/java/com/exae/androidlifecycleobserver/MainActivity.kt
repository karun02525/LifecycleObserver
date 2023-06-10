package com.exae.androidlifecycleobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var myLocationListener: MyLocationListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //lifecycle.addObserver(MyObserverLifeCycle())

        lifecycle.addObserver(MyObserver())


        myLocationListener = MyLocationListener(this) {

        }


        Log.d("TAGS", "create: MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAGS", "onResume: MainActivity")
    }

    override fun onStart() {
        super.onStart()
        myLocationListener.start()
    }

    override fun onStop() {
        super.onStop()
        myLocationListener.stop()
    }
}