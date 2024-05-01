package com.example.diplom

import android.app.Dialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.Button
import android.widget.TextView

internal class SettingsActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)
        val logoutButton: TextView = findViewById(R.id.Button5)
        logoutButton.setOnClickListener{
            val dialogBindingg=layoutInflater.inflate(R.layout.logout_dialog_window, null)
            val myDialog=Dialog(this)
            myDialog.setContentView(dialogBindingg)
            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
            val btnNUDOPUSTIM: Button = dialogBindingg.findViewById(R.id.button3333)
            btnNUDOPUSTIM.setOnClickListener{
                myDialog.dismiss()
            }
        }
    }

    fun magClicked(view: View)
    {
        val intent = Intent(this, MagaziniActivity::class.java)
        startActivity(intent)
    }
    fun catClicked(view: View)
    {
        val intent = Intent(this, CatalogActivity::class.java)
        startActivity(intent)
    }
    fun korClicked(view: View)
    {
        val intent = Intent(this, KorzinaActivity::class.java)
        startActivity(intent)
    }
    fun akClicked(view: View)
    {
        val intent = Intent(this, AkciiActivity::class.java)
        startActivity(intent)
    }
    fun profClicked(view: View)
    {
        val intent = Intent(this, ProfilActivity::class.java)
        startActivity(intent)
    }
    fun techClicked(view: View)
    {
        val intent = Intent(this, TechSupportActivity::class.java)
        startActivity(intent)
    }
    fun notificationsClicked(view: View) {}
    fun currencyClicked(view: View) {}
    fun appthemeClicked(view: View) {}
    fun applanguageClicked(view: View) {}
    fun logOutClicked(view: View) {}
    fun deleteAccountClicked(view: View) {}

}