package com.example.proyecto.arreglo

import com.example.proyecto.clase.Mascota
import com.example.proyecto.utils.appConfig

class ArregloMascota {

    fun listado():ArrayList<Mascota>{
        var data = ArrayList<Mascota>()
        var base = appConfig.BD.readableDatabase
        var sql = "select * from tb_mascota"
        var rs = base.rawQuery(sql,null)
        while(rs.moveToNext()){
            var bean = Mascota(rs.getInt(0),rs.getString(1),
                               rs.getString(2),rs.getInt(3),
                               rs.getString(4),rs.getString(5),
                               rs.getString(6), rs.getInt(7),
                               rs.getInt(8), rs.getInt(9))
            data.add(bean)
        }
        return data
    }

}