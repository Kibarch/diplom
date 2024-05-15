package com.example.diplom

import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import com.example.diplom.databinding.NachalnStranicaBinding

class NachalnStranicaActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val nachalnStranicaBinding : NachalnStranicaBinding = NachalnStranicaBinding.inflate(layoutInflater)
        setContentView(nachalnStranicaBinding.root)
        nachalnStranicaBinding.textZaregPoz.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        nachalnStranicaBinding.buttonRegistrationPerehod.setOnClickListener{
            val intent = Intent(this, VvodDannPolzActivity::class.java)
            startActivity(intent)
        }
        nachalnStranicaBinding.buttonVoiti.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        nachalnStranicaBinding.button4.setOnClickListener {
            val intent = Intent(this, WorkWithDB::class.java)
            startActivity(intent)
        }
    }
}