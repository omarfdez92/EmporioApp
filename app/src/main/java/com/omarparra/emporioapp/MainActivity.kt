package com.omarparra.emporioapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun loginClicked(view: View){

        val email = emailText.text.toString()
        val password = passwordText.text.toString()

        if(email.isEmpty() && password.isEmpty()){

            Toast.makeText(this, "POR FAVOR, LLENE TODOS LOS CAMPOS", Toast.LENGTH_SHORT).show()

        }else if(email == "andrea@gmail.com" && password == "abc123"){

            val intentMainChoose = Intent(this, MainChoose::class.java)
            startActivity(intentMainChoose)

        }else{

            Toast.makeText(this, "CORREO O CONTRASEÑA INCORRECTA", Toast.LENGTH_SHORT).show()

        }


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
