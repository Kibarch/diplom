package com.example.diplom

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.view.View

class TechSupportActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tech_support)
    }

    fun tech_to_mag_clicked(view: View)
    {
        val intent = Intent(this, MagaziniActivity::class.java)
        startActivity(intent)
    }
    fun tech_to_cat_clicked(view: View)
    {
        val intent = Intent(this, CatalogActivity::class.java)
        startActivity(intent)
    }
    fun tech_to_ak_clicked(view: View)
    {
        val intent = Intent(this, AkciiActivity::class.java)
        startActivity(intent)
    }
    fun tech_to_prof_clicked(view: View)
    {
        val intent = Intent(this, ProfilActivity::class.java)
        startActivity(intent)
    }
    fun tech_to_kor_clicked(view: View)
    {
        val intent = Intent(this, KorzinaActivity::class.java)
        startActivity(intent)
    }

}