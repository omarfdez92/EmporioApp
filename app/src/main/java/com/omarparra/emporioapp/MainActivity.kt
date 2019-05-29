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

        if(email.isNotEmpty() && password.isNotEmpty()){

            val mainChooseIntent = Intent(this, MainChoose::class.java)
            startActivity(mainChooseIntent)

        }else{

            Toast.makeText(this, "Por favor ingresa un correo y una contraseña", Toast.LENGTH_SHORT).show()

        }


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
