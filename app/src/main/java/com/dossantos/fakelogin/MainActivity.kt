package com.dossantos.fakelogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val init = 1
        if (init == 1) {
            Toast.makeText(this, "True", Toast.LENGTH_LONG).show()
        }
        val init2 = 1
        if (init2 == 1) {
            Toast.makeText(this, "True", Toast.LENGTH_LONG).show()
        }
        val init3 = 1
        if (init3 == 1) {
            Toast.makeText(this, "True", Toast.LENGTH_LONG).show()
        }
    }
}