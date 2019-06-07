package com.omarparra.emporioapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MapActivity : AppCompatActivity() {

    fun goNowBtnClick(view: View){

        val intentHappy = Intent(this, HappyActivity::class.java)
        startActivity(intentHappy)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
    }
}
