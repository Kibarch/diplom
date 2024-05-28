package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import com.example.diplom.databinding.MyZakaziBinding

class MyZakaziActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val myZakaziBinding : MyZakaziBinding = MyZakaziBinding.inflate(layoutInflater)
        setContentView(myZakaziBinding.root)
        myZakaziBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        myZakaziBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        myZakaziBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        myZakaziBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        myZakaziBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        myZakaziBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        myZakaziBinding.buttonDeleteHistoryZakazov.setOnClickListener{
            myZakaziBinding.Zakaz1.removeAllViews()
        }
        myZakaziBinding.arr.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        myZakaziBinding.buttonPovtorZakaza.setOnClickListener {
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
    }


}