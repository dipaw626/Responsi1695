package com.mobile.responsi1695.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mobile.responsi1695.R
import com.mobile.responsi1695.main.MainActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //remove title bar
        supportActionBar?.hide()

        //instance button
        val hometomain: Button = findViewById(R.id.btnbooknow)

        //eventbutton next
        hometomain.setOnClickListener{
            //explicit
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}