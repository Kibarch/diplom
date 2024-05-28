package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import com.example.diplom.databinding.MyKartiBinding


class MyKartiActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val myKartiBinding : MyKartiBinding = MyKartiBinding.inflate(layoutInflater)
        setContentView(myKartiBinding.root)
        myKartiBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        myKartiBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        myKartiBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        myKartiBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        myKartiBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        myKartiBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        myKartiBinding.buttonDeleteAllKarti.setOnClickListener{
            myKartiBinding.IspKarta.removeAllViews()
            myKartiBinding.SohKarta1.removeAllViews()
        }
        myKartiBinding.arr.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }

}