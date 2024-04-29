package com.example.diplom

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity

class CalendarDostavokActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar_dostavok)
    }

    fun magClicked(view: View)
    {
        val intent = Intent(this, MagaziniActivity::class.java)
        startActivity(intent)
    }
    fun catClicked(view: View)
    {
        val intent = Intent(this, CatalogActivity::class.java)
        startActivity(intent)
    }
    fun korClicked(view: View)
    {
        val intent = Intent(this, KorzinaActivity::class.java)
        startActivity(intent)
    }
    fun akClicked(view: View)
    {
        val intent = Intent(this, AkciiActivity::class.java)
        startActivity(intent)
    }
    fun profClicked(view: View)
    {
        val intent = Intent(this, ProfilActivity::class.java)
        startActivity(intent)
    }

}