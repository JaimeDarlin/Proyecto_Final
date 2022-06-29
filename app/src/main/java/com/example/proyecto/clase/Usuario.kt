package com.example.proyecto.clase

import java.io.Serializable

class Usuario(var codUsuario:Int, var nomUsuario:String,
              var emailUsuario:String, var celUsuario:Int,
              var idUsuario:String, var pasUsuario: String,
              var codDistrito:Int):Serializable {
}