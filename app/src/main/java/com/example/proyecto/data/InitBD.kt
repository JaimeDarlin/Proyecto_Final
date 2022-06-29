package com.example.proyecto.data

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.proyecto.utils.appConfig

class InitBD: SQLiteOpenHelper(appConfig.CONTEXT,
                               appConfig.BASE,
                               null,
                               appConfig.VERSION) {

    override fun onCreate(db: SQLiteDatabase) {

        db.execSQL("create table tb_distrito("+
                       "codDistrito integer primary key autoincrement,"+
                       "nomDistrito varchar(40))")
        db.execSQL("create table tb_usuario(" +
                "codUsuario integer primary key autoincrement," +
                "nomUsuario varchar(30)," +
                "emailUsuario varchar(40)," +
                "celUsuario Integer," +
                "idUsuario varchar(40)," +
                "pasUsuario varchar(40)," +
                "codDistrito int references tb_distrito(codDistrito))")
        db.execSQL("create table tb_tipo(" +
                "codTipo Integer primary key autoincrement," +
                "nomTipo varchar(40))")
        db.execSQL("create table tb_mascota(" +
                "codMascota Integer primary key autoincrement," +
                "nomMascota varchar(30)," +
                "razaMascota varchar(40)," +
                "edadMascota Integer," +
                "desMascota varchar(150)," +
                "dirMascota varchar(100)," +
                "fotoMascota varchar(40)," +
                "codUsuario int references tb_usuario(codUsuario)," +
                "codDistrito int references tb_distrito(codDistrito)," +
                "codTipo int references tb_tipo(codTipo))")

        db.execSQL("insert into tb_distrito values(null,'Independencia')")
        db.execSQL("insert into tb_distrito values(null,'Comas')")
        db.execSQL("insert into tb_distrito values(null,'Los Olivos')")
        db.execSQL("insert into tb_distrito values(null,'San Juan de Lurigancho')")
        db.execSQL("insert into tb_distrito values(null,'Surco')")

        db.execSQL("insert into tb_usuario values(null,'Jaime Santamaria','jaimedarlin.sg@gmail.com',981222219, 'James','123456',2)")

        db.execSQL("insert into tb_tipo values(null,'perro')")
        db.execSQL("insert into tb_tipo values(null,'gato')")

        db.execSQL("insert into tb_mascota values(null,'Baloo','Cruzado',2,'Perro grande color oscuro, jugueton y dormilon','Jr. Montero Rosas 653','p1',1,2,1)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}