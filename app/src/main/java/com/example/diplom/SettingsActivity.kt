package com.example.diplom

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import com.example.diplom.databinding.SettingsBinding

internal class SettingsActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val settBinding : SettingsBinding = SettingsBinding.inflate(layoutInflater)
        setContentView(settBinding.root)
        settBinding.mag.setOnClickListener{
            val intent = Intent(this, KartaMagazinovActivity::class.java)
            startActivity(intent)
        }
        settBinding.cat.setOnClickListener{
            val intent = Intent(this, CatalogActivity::class.java)
            startActivity(intent)
        }
        settBinding.kor.setOnClickListener{
            val intent = Intent(this, KorzinaActivity::class.java)
            startActivity(intent)
        }
        settBinding.ak.setOnClickListener{
            val intent = Intent(this, AkciiActivity::class.java)
            startActivity(intent)
        }
        settBinding.prof.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
        settBinding.tech.setOnClickListener{
            val intent = Intent(this, TechSupportActivity::class.java)
            startActivity(intent)
        }
        settBinding.buttonAppTheme.setOnClickListener{
            val dialogAppTheme=layoutInflater.inflate(R.layout.app_theme, null)
            val myDialogAppTheme=Dialog(this)
            myDialogAppTheme.setContentView(dialogAppTheme)
            myDialogAppTheme.setCancelable(true)
            myDialogAppTheme.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialogAppTheme.show()
            fun setLightTheme(){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            fun setDarkTheme(){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            fun getSavedThemeState(): Boolean{
                val sharedPreferences: SharedPreferences = getSharedPreferences("ThemePrefs", Context.MODE_PRIVATE)
                return sharedPreferences.getBoolean("isDarktheme", false)
            }
            fun saveThemeState(isDarkTheme: Boolean){
                val sharedPreferences: SharedPreferences = getSharedPreferences("ThemePrefs", Context.MODE_PRIVATE)
                val editor: SharedPreferences.Editor? = sharedPreferences.edit()
                editor?.putBoolean("isDarkTheme", isDarkTheme)
                editor?.apply()
            }


        }
        settBinding.buttonNotifications.setOnClickListener{
            val dialogNotifications=layoutInflater.inflate(R.layout.notifications, null)
            val myDialogNotifications=Dialog(this)
            myDialogNotifications.setContentView(dialogNotifications)
            myDialogNotifications.setCancelable(true)
            myDialogNotifications.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialogNotifications.show()
        }
        settBinding.buttonLogOut.setOnClickListener{
            val dialogLogout=layoutInflater.inflate(R.layout.logout_dialog_window, null)
            val myDialogLogout=Dialog(this)
            myDialogLogout.setContentView(dialogLogout)
            myDialogLogout.setCancelable(true)
            myDialogLogout.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialogLogout.show()
            val yesLogBTN = dialogLogout.findViewById<Button>(R.id.buttonYesLogout)
            yesLogBTN.setOnClickListener{
                myDialogLogout.dismiss()
                val intent = Intent(this, NachalnStranicaActivity::class.java)
                startActivity(intent)
            }
            val noLogBTN = dialogLogout.findViewById<Button>(R.id.buttonNoLogout)
            noLogBTN.setOnClickListener{
                myDialogLogout.dismiss()
            }
        }
        settBinding.buttonDeleteAccount.setOnClickListener{
            val dialogDelacc=layoutInflater.inflate(R.layout.deleteaccount_dialog_window, null)
            val myDialogDelacc=Dialog(this)
            myDialogDelacc.setContentView(dialogDelacc)
            myDialogDelacc.setCancelable(true)
            myDialogDelacc.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialogDelacc.show()
            val yesDelBTN = dialogDelacc.findViewById<Button>(R.id.buttonYesDeleteAcc)
            yesDelBTN.setOnClickListener{
                myDialogDelacc.dismiss()
                val intent = Intent(this, NachalnStranicaActivity::class.java)
                startActivity(intent)
            }
            val noDelBTN = dialogDelacc.findViewById<Button>(R.id.buttonNoDeleteAcc)
            noDelBTN.setOnClickListener{
                myDialogDelacc.dismiss()
            }
        }
        settBinding.arr.setOnClickListener{
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }
    }

}