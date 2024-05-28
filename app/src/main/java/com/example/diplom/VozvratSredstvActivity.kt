package com.example.diplom
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.VozvratSredstvBinding

class VozvratSredstvActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vozvratSredstvBinding : VozvratSredstvBinding = VozvratSredstvBinding.inflate(layoutInflater)
        setContentView(vozvratSredstvBinding.root)
        vozvratSredstvBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        vozvratSredstvBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        vozvratSredstvBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        vozvratSredstvBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        vozvratSredstvBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        vozvratSredstvBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        vozvratSredstvBinding.arr.setOnClickListener{
            val intent = Intent(this, InfoForClientActivity::class.java)
            startActivity(intent)
        }
        vozvratSredstvBinding.chat.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
    }
}