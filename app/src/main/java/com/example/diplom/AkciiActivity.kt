package com.example.diplom

import android.app.Dialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.example.diplom.databinding.AkciiBinding

class AkciiActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val akciiBinding: AkciiBinding = AkciiBinding.inflate(layoutInflater)
        setContentView(akciiBinding.root)
        akciiBinding.mag.setOnClickListener {
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        akciiBinding.cat.setOnClickListener {
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        akciiBinding.kor.setOnClickListener {
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        akciiBinding.prof.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        akciiBinding.tech.setOnClickListener {
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        akciiBinding.promo1.setOnClickListener {
            val dialogPromoInfo = layoutInflater.inflate(R.layout.promokefir, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
        }
        akciiBinding.promo2.setOnClickListener {
            val dialogPromoInfo = layoutInflater.inflate(R.layout.promokefir, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
        }
        akciiBinding.promo3.setOnClickListener {
            val dialogPromoInfo = layoutInflater.inflate(R.layout.promokefir, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
        }
        akciiBinding.promo4.setOnClickListener {
            val dialogPromoInfo = layoutInflater.inflate(R.layout.promokefir, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
        }
        akciiBinding.promo5.setOnClickListener {
            val dialogPromoInfo = layoutInflater.inflate(R.layout.promokefir, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
        }
    }
}