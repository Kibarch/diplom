package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import com.example.diplom.databinding.TechSupportBinding

class TechSupportActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val techSupportBinding : TechSupportBinding = TechSupportBinding.inflate(layoutInflater)
        setContentView(techSupportBinding.root)
        techSupportBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        techSupportBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        techSupportBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        techSupportBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        techSupportBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }
}