package com.example.diplom

import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import com.example.diplom.databinding.LoginBinding

class LoginActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val loginBinding : LoginBinding = LoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        loginBinding.buttonVoiti.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
    }
}