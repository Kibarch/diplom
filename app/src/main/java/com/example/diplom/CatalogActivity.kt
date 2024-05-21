package com.example.diplom

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.CatalogBinding

class CatalogActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val catalogActivityBinding : CatalogBinding = CatalogBinding.inflate(layoutInflater)
        setContentView(catalogActivityBinding.root)
        val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
        var adress = sharedAdress.getString("adress", "")
        catalogActivityBinding.adres.text = adress

        catalogActivityBinding.mag.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        catalogActivityBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        catalogActivityBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        catalogActivityBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        catalogActivityBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        catalogActivityBinding.adres.setOnClickListener{
            val intent = Intent(this, AdresaDostavokActivity::class.java)
            startActivity(intent)
        }
        catalogActivityBinding.povtor.setOnClickListener {
            val intent = Intent(this, MyZakaziActivity::class.java)
            startActivity(intent)
        }
    }
}