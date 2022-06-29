package com.example.proyecto.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.R
import com.example.proyecto.clase.Mascota

class MascotaAdapter(val info:ArrayList<Mascota>):RecyclerView.Adapter<VistaMascota>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VistaMascota {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_mascota,parent,false)
        return VistaMascota(view)
    }

    override fun onBindViewHolder(holder: VistaMascota, position: Int) {
        holder.tvNombreM.text = info.get(position).nomMascota
        holder.tvRazaM.text = info.get(position).razaMascota
        holder.tvEdadM.text = info.get(position).edadMascota.toString()
    }

    override fun getItemCount(): Int {
        return info.size
    }

}