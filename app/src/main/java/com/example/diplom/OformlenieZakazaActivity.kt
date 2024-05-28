package com.example.diplom

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import  androidx.activity.ComponentActivity
import com.example.diplom.databinding.OformleniezakazaBinding
class OformlenieZakazaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val oformleniezakazaBinding: OformleniezakazaBinding = OformleniezakazaBinding.inflate(layoutInflater)
        setContentView(oformleniezakazaBinding.root)
        if (oformleniezakazaBinding.adres.text == "")
            oformleniezakazaBinding.adres.text = "Выбрать адрес доставки"
        oformleniezakazaBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        oformleniezakazaBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        oformleniezakazaBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        oformleniezakazaBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        oformleniezakazaBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        oformleniezakazaBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        oformleniezakazaBinding.arr.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        oformleniezakazaBinding.adres.setOnClickListener{
            val intent = Intent(this, AdresaDostavokActivity::class.java)
            startActivity(intent)
        }
        val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
        val sharedCost : SharedPreferences = getSharedPreferences("mySharedCost", Context.MODE_PRIVATE)
        var adress = sharedAdress.getString("adress", "")
        oformleniezakazaBinding.totalcost.text = sharedCost.getString("sum","")
        oformleniezakazaBinding.adres.text = adress
        oformleniezakazaBinding.deliveryadres.text = adress

    }
}