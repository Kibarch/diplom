package com.example.diplom

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProfilActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profil)
        val sharedPref = getSharedPreferences("mySharedPref", Context.MODE_PRIVATE)
        var ima = sharedPref.getString("ima","")
        var familiya = sharedPref.getString("familiya","")

        var textIma: TextView = findViewById(R.id.textViewIma)
        var textFamiliya: TextView = findViewById(R.id.textViewFamiliya)
        if (Global().flag == 1)
        {
            textIma.text = Global().stockIma
            textFamiliya.text = Global().stockFamiliya
            Global().flag = 0
        }
        else
            if (ima != "" && familiya != "")
            {
                textIma.text = ima
                Global().polzName = ima.toString()
                textFamiliya.text = familiya
                Global().polzFamil = familiya.toString()

                //Global().polzName = ima.toString()
                //textIma.text = Global().polzName
                //Global().polzFamil = familiya.toString()
                //textFamiliya.text = Global().polzFamil
            }
        val magBTN: ImageView = findViewById(R.id.mag)
        magBTN.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        val catBTN: ImageView = findViewById(R.id.cat)
        catBTN.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        val korBTN: ImageView = findViewById(R.id.kor)
        korBTN.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        val akBTN: ImageView = findViewById(R.id.ak)
        akBTN.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        val techBTN: ImageView = findViewById(R.id.tech)
        techBTN.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        val myZakBTN = findViewById<Button>(R.id.buttonMyZakazi)
        myZakBTN.setOnClickListener{
            val intent = Intent(this, MyZakaziActivity::class.java)
            startActivity(intent)
        }
        val myOtzBTN = findViewById<Button>(R.id.buttonMyOtzivi)
        myOtzBTN.setOnClickListener{
            val intent = Intent(this, MyOtziviActivity::class.java)
            startActivity(intent)
        }
        val myKartBTN = findViewById<Button>(R.id.buttonMyKarti)
        myKartBTN.setOnClickListener{
            val intent = Intent(this, MyKartiActivity::class.java)
            startActivity(intent)
        }
        val calDostBTN = findViewById<Button>(R.id.buttonCalendarDostavok)
        calDostBTN.setOnClickListener{
            val intent = Intent(this, CalendarDostavokActivity::class.java)
            startActivity(intent)
        }
        val hideMagBTN = findViewById<Button>(R.id.buttonHideMagazini)
        hideMagBTN.setOnClickListener{
            val intent = Intent(this, HideMagaziniActivity::class.java)
            startActivity(intent)
        }
        val adrDostBTN = findViewById<Button>(R.id.buttonAdresaDostavok)
        adrDostBTN.setOnClickListener{
            val intent = Intent(this, AdresaDostavokActivity::class.java)
            startActivity(intent)
        }
        val settBTN = findViewById<Button>(R.id.buttonSettings)
        settBTN.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        val aboutPrilBTN = findViewById<Button>(R.id.buttonAboutPril)
        aboutPrilBTN.setOnClickListener{
            val intent = Intent(this, AboutPrilActivity::class.java)
            startActivity(intent)
        }
        val infForClBTN = findViewById<Button>(R.id.buttonInfoForClient)
        infForClBTN.setOnClickListener{
            val intent = Intent(this, InfoForClientActivity::class.java)
            startActivity(intent)
        }
    }
}