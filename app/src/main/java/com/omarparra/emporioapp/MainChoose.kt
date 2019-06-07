package com.omarparra.emporioapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.omarparra.emporioapp.R

class MainChoose : AppCompatActivity() {

    fun docClicked(view: View){

        val intentDoc = Intent(this, OptionsActivity::class.java)
        intentDoc.putExtra("option123", "Doctores")
        startActivity(intentDoc)

    }

    fun nurseClicked(view: View){

        val intentNurse = Intent(this, OptionsActivity::class.java)
        intentNurse.putExtra("option123", "Enfermeros")
        startActivity(intentNurse)

    }

    fun nutriClicked(view: View){

        val intentNutri = Intent(this, OptionsActivity::class.java)
        intentNutri.putExtra("option123", "Nutriologos")
        startActivity(intentNutri)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_choose)
    }
}
