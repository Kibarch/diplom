package com.example.diplom

import android.app.Dialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.diplom.databinding.SettingsBinding

internal class SettingsActivity: ComponentActivity()
{
    private lateinit var settBinding: SettingsBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        settBinding = SettingsBinding.inflate(layoutInflater)
        setContentView(settBinding.root)
        settBinding.mag.setOnClickListener{
            val intent = Intent(this, MagaziniActivity::class.java)
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
                val intent = Intent(this, NachStranActivity::class.java)
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
                Global().polzName = Global().stockIma
                Global().polzFamil = Global().stockFamiliya
                val intent = Intent(this, NachStranActivity::class.java)
                startActivity(intent)
            }
            val noDelBTN = dialogDelacc.findViewById<Button>(R.id.buttonNoDeleteAcc)
            noDelBTN.setOnClickListener{
                myDialogDelacc.dismiss()
            }
        }
    }

}