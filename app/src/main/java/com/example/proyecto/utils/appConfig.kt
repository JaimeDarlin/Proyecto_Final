package com.example.proyecto.utils

import android.app.Application
import android.content.Context
import com.example.proyecto.data.InitBD

class appConfig: Application() {

    companion object{
        lateinit var CONTEXT: Context
        lateinit var BD: InitBD
        val BASE = "adopcion.db"
        val VERSION = 1
    }

    override fun onCreate() {
        super.onCreate()
        CONTEXT = applicationContext
        BD = InitBD()
    }
}