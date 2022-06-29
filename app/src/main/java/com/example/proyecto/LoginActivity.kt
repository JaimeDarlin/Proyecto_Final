package com.example.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnLogin: Button
    lateinit var btnRegistrarte: Button
    lateinit var edtEmail: EditText
    lateinit var edtPass: EditText
    lateinit var edtOlvidastePass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.edtRazaMascota);
        edtPass = findViewById(R.id.edtDistritoMascota);
        //edtOlvidastePass = findViewById(R.id.edtOlvidastePass);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegistrarte = findViewById(R.id.btnRegistrarte);

        }



    override fun onClick(v: View?) {

        val email = edtEmail.text.toString()
        val pass = edtPass.text.toString()

        if(v==btnLogin){

            if (email == "jaimedarlin.sg@gmail.com" && pass == "123456") {

                finish()
                startActivity(Intent(this,MainActivity::class.java))
            }

        }else {
            // login incorrecto
            Toast.makeText(this, "Verifique sus credenciales", Toast.LENGTH_SHORT).show()
        }

    }

}