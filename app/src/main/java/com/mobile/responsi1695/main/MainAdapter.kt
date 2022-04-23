package com.mobile.responsi1695.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mobile.responsi1695.R

class MainAdapter:RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    //declare dataset array
    private var foto = intArrayOf(R.drawable.stetoskop, R.drawable.ribs, R.drawable.teeth, R.drawable.healthcare)
    private var nama = arrayOf("General Practice","Specialist","Dentist","Call Center")
    private var desc = arrayOf("Dokter Umum","Dokter Spesialis","Dokter Gigi","Telp Darurat")

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        //instance pallete cardview
        var itemFoto:ImageView
        var itemNama:TextView
        var itemDesc:TextView
//        var itemCheck:CheckBox

        init {
            itemFoto = itemView.findViewById(R.id.item_foto)
            itemNama = itemView.findViewById(R.id.item_nama)
            itemDesc = itemView.findViewById(R.id.item_desc)
//            itemCheck = itemView.findViewById(R.id.item_check)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemFoto.setImageResource(foto[position])
        holder.itemNama.text = nama[position]
        holder.itemDesc.text = desc[position]
//        holder.itemCheck.isChecked =
    }

    override fun getItemCount(): Int {
        return nama.size
    }


}