package com.example.diplom

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import com.example.diplom.databinding.ProfilBinding

class ProfilActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val profBinding : ProfilBinding = ProfilBinding.inflate(layoutInflater)
        setContentView(profBinding.root)
        val db = MainDB.getDb(this)
        //db.getDao().getName()
        val sharedPref = getSharedPreferences("mySharedPref", Context.MODE_PRIVATE)
        var ima = sharedPref.getString("ima","")
        var familiya = sharedPref.getString("familiya","")
        val sharedIm = getSharedPreferences("mySharedIm", Context.MODE_PRIVATE)

        profBinding.imageProfil.setImageResource(sharedIm.getInt("man",R.drawable.image1))
        if (Global().flag == 1)
        {
            profBinding.textViewIma.text = Global().stockIma
            profBinding.textViewFamiliya.text = Global().stockFamiliya
            Global().flag = 0
        }
        else
            if (ima != "" && familiya != "")
            {
                profBinding.textViewIma.text = ima
                Global().polzName = ima.toString()
                profBinding.textViewFamiliya.text = familiya
                Global().polzFamil = familiya.toString()

            }
        profBinding.mag.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        profBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        profBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        profBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        profBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonMyZakazi.setOnClickListener{
            val intent = Intent(this, MyZakaziActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonMyOtzivi.setOnClickListener{
            val intent = Intent(this, MyOtziviActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonMyKarti.setOnClickListener {
            val intent = Intent(this, MyKartiActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonCalendarDostavok.setOnClickListener{
            val intent = Intent(this, CalendarDostavokActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonHideMagazini.setOnClickListener{
            val intent = Intent(this, HideMagaziniActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonAdresaDostavok.setOnClickListener{
            val intent = Intent(this, AdresaDostavokActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonSettings.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonAboutPril.setOnClickListener{
            val intent = Intent(this, AboutPrilActivity::class.java)
            startActivity(intent)
        }
        profBinding.buttonInfoForClient.setOnClickListener{
            val intent = Intent(this, InfoForClientActivity::class.java)
            startActivity(intent)
        }
    }
}