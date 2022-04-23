package com.mobile.responsi1695.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobile.responsi1695.R
import com.mobile.responsi1695.home.HomeActivity

class MainActivity : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<MainAdapter.ViewHolder>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //back to home awal
        val ivmaintohome:ImageView = findViewById(R.id.imageView2)

        ivmaintohome.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        //set layout menjadi linear layout
        layoutManager =LinearLayoutManager(this)

        //instance Recycler View
        var rvMain:RecyclerView = findViewById(R.id.rvfitur)

        //setlayout untuk recycler view
        rvMain.layoutManager = layoutManager

        //call adapter dan set recycler view sesuai adapter yang dibuat
        adapter = MainAdapter()
        rvMain.adapter = adapter

    }
}