package com.example.diplom

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.DeliveryBinding

class DeliveryActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val deliveryBinding : DeliveryBinding = DeliveryBinding.inflate(layoutInflater)
        setContentView(deliveryBinding.root)
        deliveryBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        deliveryBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        deliveryBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        deliveryBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        deliveryBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        deliveryBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        deliveryBinding.arr.setOnClickListener{
            val intent = Intent(this, InfoForClientActivity::class.java)
            startActivity(intent)
        }
    }
}