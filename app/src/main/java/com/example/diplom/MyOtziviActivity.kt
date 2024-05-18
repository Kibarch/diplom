package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.ImageView
import com.example.diplom.databinding.MyOtziviBinding

class MyOtziviActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val myOtziviBinding : MyOtziviBinding = MyOtziviBinding.inflate(layoutInflater)
        setContentView(myOtziviBinding.root)
        myOtziviBinding.mag.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        myOtziviBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        myOtziviBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        myOtziviBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        myOtziviBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        myOtziviBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        myOtziviBinding.buttonDeleteAllOtzivi.setOnClickListener{
            myOtziviBinding.Otziv1.removeAllViews()
            myOtziviBinding.Otziv2.removeAllViews()
        }
        myOtziviBinding.arr.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }
}