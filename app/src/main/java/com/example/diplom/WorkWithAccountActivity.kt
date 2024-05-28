package com.example.diplom
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.WorkWithAccountBinding

class WorkWithAccountActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val workWithAccountBinding : WorkWithAccountBinding = WorkWithAccountBinding.inflate(layoutInflater)
        setContentView(workWithAccountBinding.root)
        workWithAccountBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        workWithAccountBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        workWithAccountBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        workWithAccountBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        workWithAccountBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        workWithAccountBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        workWithAccountBinding.arr.setOnClickListener{
            val intent = Intent(this, InfoForClientActivity::class.java)
            startActivity(intent)
        }
        workWithAccountBinding.chat.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
    }
}