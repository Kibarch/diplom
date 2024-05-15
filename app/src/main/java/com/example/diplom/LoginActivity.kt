package com.example.diplom

import android.app.Dialog
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button
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