package com.example.proyecto.clase

import java.io.Serializable

class Mascota(var codMascota:Int, var nomMascota:String,
              var razaMascota:String, var edadMascota:Int,
              var desMascota:String, var dirMascota:String,
              var fotoMascota:String, var codUsuario:Int,
              var codDistrito:Int, var codTipo:Int):Serializable {
}