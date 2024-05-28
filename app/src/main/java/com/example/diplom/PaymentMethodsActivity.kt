package com.example.diplom
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.PaymentMethodsBinding

class PaymentMethodsActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val paymentMethodsBinding : PaymentMethodsBinding = PaymentMethodsBinding.inflate(layoutInflater)
        setContentView(paymentMethodsBinding.root)
        paymentMethodsBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        paymentMethodsBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        paymentMethodsBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        paymentMethodsBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        paymentMethodsBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        paymentMethodsBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        paymentMethodsBinding.arr.setOnClickListener{
            val intent = Intent(this, InfoForClientActivity::class.java)
            startActivity(intent)
        }
    }
}