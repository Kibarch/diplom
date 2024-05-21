package com.example.diplom

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.content.SharedPreferences
import com.example.diplom.databinding.KorzinaBinding

class KorzinaActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val korzinaBinding : KorzinaBinding = KorzinaBinding.inflate(layoutInflater)
        setContentView(korzinaBinding.root)
        korzinaBinding.mag.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        korzinaBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        korzinaBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        korzinaBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        korzinaBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        korzinaBinding.oform.setOnClickListener {
            val intent = Intent(this, OformlenieZakazaActivity::class.java)
            startActivity(intent)
            val number1 = korzinaBinding.number1.text.toString()
            val number2 = korzinaBinding.number2.text.toString()
            val sum : Float = number1.toFloat() + number2.toFloat()
            val sharedCost : SharedPreferences = getSharedPreferences("mySharedCost", Context.MODE_PRIVATE)
            val editor = sharedCost.edit()
            editor.putString("sum",sum.toString())
            editor.apply()
        }
        val prodact1 = korzinaBinding.prodactcost1.text.toString()
        val prodact2 = korzinaBinding.prodactcost2.text.toString()
        val prodact3 = korzinaBinding.prodactcost3.text.toString()
        val prodact4 = korzinaBinding.prodactcost4.text.toString()
        val prodact5 = korzinaBinding.prodactcost5.text.toString()
        val prodact6 = korzinaBinding.prodactcost6.text.toString()
        val cost1 : Float = prodact1.toFloat() + prodact2.toFloat() + prodact3.toFloat()
        val cost2 : Float = prodact4.toFloat() + prodact5.toFloat() + prodact6.toFloat()
        korzinaBinding.number1.text = cost1.toString()
        korzinaBinding.number2.text = cost2.toString()
    }
}