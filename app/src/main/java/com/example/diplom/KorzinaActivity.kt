package com.example.diplom

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.view.View

class KorzinaActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korzina)
    }

    fun kor_to_mag_clicked(view: View)
    {
        val intent = Intent(this, MagaziniActivity::class.java)
        startActivity(intent)
    }
    fun kor_to_cat_clicked(view: View)
    {
        val intent = Intent(this, CatalogActivity::class.java)
        startActivity(intent)
    }
    fun kor_to_ak_clicked(view: View)
    {
        val intent = Intent(this, AkciiActivity::class.java)
        startActivity(intent)
    }
    fun kor_to_prof_clicked(view: View)
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