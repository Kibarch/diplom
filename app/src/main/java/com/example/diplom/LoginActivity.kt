package com.example.diplom

import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class LoginActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val loginBTN: Button = findViewById(R.id.buttonVoiti)
        loginBTN.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
    }
}