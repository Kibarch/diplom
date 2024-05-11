package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.ImageView
import com.example.diplom.databinding.InfoForClientBinding

class InfoForClientActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val infoForClientBinding : InfoForClientBinding = InfoForClientBinding.inflate(layoutInflater)
        setContentView(infoForClientBinding.root)
        infoForClientBinding.mag.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonWorkWithPril.setOnClickListener{
            val intent = Intent(this, WorkWithPrilActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonWorkWithAccount.setOnClickListener{
            val intent = Intent(this, WorkWithAccActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonDelivery.setOnClickListener {
            val intent = Intent(this, DeliveryActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonPaymentMethods.setOnClickListener{
            val intent = Intent(this, PaymentMethodsActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonVozvratSredstv.setOnClickListener {
            val intent = Intent(this, VozvratSredstvActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonPolitConfid.setOnClickListener {
            val intent = Intent(this, PolitConfidActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonAboutUs.setOnClickListener {
            val intent = Intent(this, AboutUsActivity::class.java)
            startActivity(intent)
        }
        infoForClientBinding.buttonContacts.setOnClickListener {
            val intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        }
    }

}