package com.example.diplom

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.view.View

class AkciiActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akcii)
    }

    fun ak_to_mag_clicked(view: View)
    {
        val intent = Intent(this, MagaziniActivity::class.java)
        startActivity(intent)
    }
    fun ak_to_cat_clicked(view: View)
    {
        val intent = Intent(this, CatalogActivity::class.java)
        startActivity(intent)
    }
    fun ak_to_kor_clicked(view: View)
    {
        val intent = Intent(this, KorzinaActivity::class.java)
        startActivity(intent)
    }
    fun ak_to_prof_clicked(view: View)
    {
        val intent = Intent(this, ProfilActivity::class.java)
        startActivity(intent)
    }
    fun tech_clicked(view: View)
    {
        val intent = Intent(this, TechSupportActivity::class.java)
        startActivity(intent)
    }

}