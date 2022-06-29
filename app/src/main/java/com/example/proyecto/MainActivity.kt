package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyecto.adapter.MascotaAdapter
import com.example.proyecto.arreglo.ArregloMascota

class MainActivity : AppCompatActivity(),View.OnClickListener {

    lateinit var btnBuscar: Button
    lateinit var rvMascota: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBuscar = findViewById(R.id.btnBuscar)
        rvMascota = findViewById(R.id.rvMascota)
        btnBuscar.setOnClickListener(this)

        var lista = ArregloMascota().listado()
        var adaptador = MascotaAdapter(lista)
        rvMascota.layoutManager = LinearLayoutManager(this)
        rvMascota.adapter = adaptador

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}