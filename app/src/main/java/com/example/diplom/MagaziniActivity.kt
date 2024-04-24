package com.example.diplom

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class MagaziniActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magazini)

    }
    fun mag_to_cat_clicked(view: View)
    {
        val intent = Intent(this, CatalogActivity::class.java)
        startActivity(intent)
    }
    fun mag_to_kor_clicked(view: View)
    {
        val intent = Intent(this, KorzinaActivity::class.java)
        startActivity(intent)
    }
    fun mag_to_ak_clicked(view: View)
    {
        val intent = Intent(this, AkciiActivity::class.java)
        startActivity(intent)
    }
    fun mag_to_prof_clicked(view: View)
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

