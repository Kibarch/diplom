package com.example.diplom

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.view.View

class ProfilActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
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
    fun myZakaziClicked(view: View)
    {
        val intent = Intent(this, MyZakaziActivity::class.java)
        startActivity(intent)
    }
    fun myOtziviClicked(view: View)
    {
        val intent = Intent(this, MyOtziviActivity::class.java)
        startActivity(intent)
    }
    fun myKartiClicked(view: View)
    {
        val intent = Intent(this, MyKartiActivity::class.java)
        startActivity(intent)
    }
    fun calendarDostavokClicked(view: View)
    {
        val intent = Intent(this, CalendarDostavokActivity::class.java)
        startActivity(intent)
    }
    fun hideMagaziniClicked(view: View)
    {
        val intent = Intent(this, HideMagaziniActivity::class.java)
        startActivity(intent)
    }
    fun adresaDostavokClicked(view: View)
    {
        val intent = Intent(this, AdresaDostavokActivity::class.java)
        startActivity(intent)
    }
    fun settingsClicked(view: View)
    {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
    fun aboutPrilClicked(view: View)
    {
        val intent = Intent(this, AboutPrilActivity::class.java)
        startActivity(intent)
    }
    fun infoForClientClicked(view: View)
    {
        val intent = Intent(this, InfoForClientActivity::class.java)
        startActivity(intent)
    }
}