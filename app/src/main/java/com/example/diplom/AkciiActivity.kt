package com.example.diplom

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.TextView
import com.example.diplom.databinding.AkciiBinding

class AkciiActivity : ComponentActivity()
{
    @SuppressLint("InflateParams")
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
            val sharedTovar = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val editor = sharedTovar.edit()
            editor.putString("tovar", akciiBinding.textPromo1.text.toString())
            editor.putString("value",akciiBinding.textPromo12.text.toString())
            editor.apply()
            val dialogPromoInfo = layoutInflater.inflate(R.layout.info_about_ak, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
            val sharedTovarr = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val tovar = mydialogPromoInfo.findViewById<TextView>(R.id.textTovarAk)
            val value = mydialogPromoInfo.findViewById<TextView>(R.id.textValueAk)
            tovar.append(sharedTovarr.getString("tovar",""))
            value.append(sharedTovarr.getString("value",""))
        }
        akciiBinding.promo2.setOnClickListener {
            val sharedTovar = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val editor = sharedTovar.edit()
            editor.putString("tovar", akciiBinding.textPromo2.text.toString())
            editor.putString("value",akciiBinding.textPromo22.text.toString())
            editor.apply()
            val dialogPromoInfo = layoutInflater.inflate(R.layout.info_about_ak, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
            val sharedTovarr = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val tovar = mydialogPromoInfo.findViewById<TextView>(R.id.textTovarAk)
            val value = mydialogPromoInfo.findViewById<TextView>(R.id.textValueAk)
            tovar.append(sharedTovarr.getString("tovar",""))
            value.append(sharedTovarr.getString("value",""))
        }
        akciiBinding.promo3.setOnClickListener {
            val sharedTovar = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val editor = sharedTovar.edit()
            editor.putString("tovar", akciiBinding.textPromo3.text.toString())
            editor.putString("value",akciiBinding.textPromo32.text.toString())
            editor.apply()
            val dialogPromoInfo = layoutInflater.inflate(R.layout.info_about_ak, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
            val sharedTovarr = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val tovar = mydialogPromoInfo.findViewById<TextView>(R.id.textTovarAk)
            val value = mydialogPromoInfo.findViewById<TextView>(R.id.textValueAk)
            tovar.append(sharedTovarr.getString("tovar",""))
            value.append(sharedTovarr.getString("value",""))
        }
        akciiBinding.promo4.setOnClickListener {
            val sharedTovar = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val editor = sharedTovar.edit()
            editor.putString("tovar", akciiBinding.textPromo4.text.toString())
            editor.putString("value",akciiBinding.textPromo42.text.toString())
            editor.apply()
            val dialogPromoInfo = layoutInflater.inflate(R.layout.info_about_ak, null)
            val mydialogPromoInfo = Dialog(this)
            mydialogPromoInfo.setContentView(dialogPromoInfo)
            mydialogPromoInfo.setCancelable(true)
            mydialogPromoInfo.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            mydialogPromoInfo.show()
            val sharedTovarr = getSharedPreferences("sharedTovar", Context.MODE_PRIVATE)
            val tovar = mydialogPromoInfo.findViewById<TextView>(R.id.textTovarAk)
            val value = mydialogPromoInfo.findViewById<TextView>(R.id.textValueAk)
            tovar.append(sharedTovarr.getString("tovar",""))
            value.append(sharedTovarr.getString("value",""))
        }
    }
}