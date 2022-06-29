package com.example.proyecto.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.R

class VistaMascota(item: View): RecyclerView.ViewHolder(item) {

    var tvNombreM: TextView
    var tvRazaM: TextView
    var tvEdadM: TextView

    init {
        tvNombreM = item.findViewById(R.id.tvNombreM)
        tvRazaM = item.findViewById(R.id.tvRazaM)
        tvEdadM = item.findViewById(R.id.tvEdadM)
    }


}