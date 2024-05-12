package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import com.example.diplom.databinding.HideMagaziniBinding

class HideMagaziniActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val hideMagaziniBinding : HideMagaziniBinding = HideMagaziniBinding.inflate(layoutInflater)
        setContentView(hideMagaziniBinding.root)
        hideMagaziniBinding.mag.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        hideMagaziniBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        hideMagaziniBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        hideMagaziniBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        hideMagaziniBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        hideMagaziniBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        hideMagaziniBinding.arr.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }

}