package com.example.diplom

import android.app.Dialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

internal class SettingsActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)
        val magBTN: ImageView = findViewById(R.id.mag)
        magBTN.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
            startActivity(intent)
        }
        val catBTN: ImageView = findViewById(R.id.cat)
        catBTN.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        val korBTN: ImageView = findViewById(R.id.kor)
        korBTN.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        val akBTN: ImageView = findViewById(R.id.ak)
        akBTN.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        val profBTN: ImageView = findViewById(R.id.prof)
        profBTN.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        val techBTN: ImageView = findViewById(R.id.tech)
        techBTN.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        val logoutButton: TextView = findViewById(R.id.Button5)
        logoutButton.setOnClickListener{
            val dialogBindingg=layoutInflater.inflate(R.layout.logout_dialog_window, null)
            val myDialog=Dialog(this)
            myDialog.setContentView(dialogBindingg)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
            val btnyes: Button = dialogBindingg.findViewById(R.id.buttonYes)
            btnyes.setOnClickListener{
                myDialog.dismiss()
            }
            val btnno: Button = dialogBindingg.findViewById(R.id.buttonNo)
            btnno.setOnClickListener{
                myDialog.dismiss()
            }
        }
    }

    fun notificationsClicked(view: View) {}
    fun currencyClicked(view: View) {}
    fun appthemeClicked(view: View) {}
    fun applanguageClicked(view: View) {}
    fun logOutClicked(view: View) {}
    fun deleteAccountClicked(view: View) {}

}