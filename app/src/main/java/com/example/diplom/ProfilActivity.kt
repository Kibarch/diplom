package com.example.diplom

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
        //if (Global.flagZaregPoz == 1)
        //{
            profBinding.textViewIma.text = Global.stockIma
            profBinding.textViewFamiliya.text = Global.stockFamiliya
            //Global.flagZaregPoz = 0
        //}
        //else
       // {
           // val thread3 = Thread{db.getDao().getAllItem().asLiveData().observe(this) { list ->
                //list.forEach {
                    //if (it.id == Global.userId) {
                       // Global.polzName = db.getDao().getName(it.id)
                       // profBinding.textViewIma.text = Global.polzName
                       // Global.polzFamil = db.getDao().getFamil(it.id)
                       // profBinding.textViewFamiliya.text = Global.polzFamil
                   // }
                //}
           // }}
           // thread3.start()
            //if (!thread3.isInterrupted)
              //  thread3.interrupt()
        //}
        profBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
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
