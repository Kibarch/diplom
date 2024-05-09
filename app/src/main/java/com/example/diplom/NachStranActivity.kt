package com.example.diplom

import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class NachStranActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nachaln_stranica)
        val zaregpozBTN: TextView = findViewById(R.id.textZaregPoz)
        zaregpozBTN.setOnClickListener{
            Global().flag = 1
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        val regBTN: Button = findViewById(R.id.buttonRegistrationPerehod)
        regBTN.setOnClickListener{
            val intent = Intent(this, VvodDannPolzActivity::class.java)
            startActivity(intent)
        }
        val loginBTN: Button = findViewById(R.id.buttonVoiti)
        loginBTN.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}