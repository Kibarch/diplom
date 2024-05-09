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
        val logoutBTN: TextView = findViewById(R.id.buttonLogOut)
        logoutBTN.setOnClickListener{
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
        val delacBTN: TextView = findViewById(R.id.buttonDeleteAccount)
        delacBTN.setOnClickListener{
            val dialogDelacc=layoutInflater.inflate(R.layout.deleteaccount_dialog_window, null)
            val myDialogDelacc=Dialog(this)
            myDialogDelacc.setContentView(dialogDelacc)
            myDialogDelacc.setCancelable(true)
            myDialogDelacc.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialogDelacc.show()
            val yesDelBTN = dialogDelacc.findViewById<Button>(R.id.buttonYesDeleteAcc)
            yesDelBTN.setOnClickListener{
                myDialogDelacc.dismiss()
                Global().polzName = ""
                Global().polzFamil = ""
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