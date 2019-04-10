package com.designintercao.splashscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.v4.os.HandlerCompat.postDelayed



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handle = Handler()
        handle.postDelayed(Runnable { mostrarLogin() }, 2000)
    }
    private fun mostrarLogin() {
        val intent = Intent(
            this@MainActivity,
            Login::class.java
        )
        startActivity(intent)
        finish()
    }
}
