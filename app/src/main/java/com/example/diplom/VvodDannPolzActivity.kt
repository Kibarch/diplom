package com.example.diplom

import android.app.Dialog
import android.content.Context
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import com.example.diplom.databinding.VvodDannihPolzBinding

class VvodDannPolzActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val vvodDanBinding : VvodDannihPolzBinding = VvodDannihPolzBinding.inflate(layoutInflater)
        setContentView(vvodDanBinding.root)
        val db = MainDB.getDb(this)
        vvodDanBinding.buttonRegistration.setOnClickListener{
            val sharedPref = getSharedPreferences("mySharedPref", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            if (vvodDanBinding.textFieldIma.text.toString() == "" || vvodDanBinding.textFieldFamiliya.text.toString() == "" || vvodDanBinding.textFieldLoginEmail.text.toString() == "" || vvodDanBinding.textFieldPhone.text.toString() == "" || vvodDanBinding.textFieldLoginPassword.text.toString() == "")
            {
                val dialogNullImaOrFam=layoutInflater.inflate(R.layout.null_polz_dann_dialog_window, null)
                val myDialogNullImaFam= Dialog(this)
                myDialogNullImaFam.setContentView(dialogNullImaOrFam)
                myDialogNullImaFam.setCancelable(true)
                myDialogNullImaFam.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                myDialogNullImaFam.show()
                val okBTN = dialogNullImaOrFam.findViewById<Button>(R.id.buttonOkNullImaFam)
                okBTN.setOnClickListener{
                    myDialogNullImaFam.dismiss()
                }
            }
            else
            {
                if (!vvodDanBinding.checkPolitConfid.isChecked)
                {
                    val dialogPolitAgree=layoutInflater.inflate(R.layout.polit_agree_dialog_window, null)
                    val myDialogPolitAgree= Dialog(this)
                    myDialogPolitAgree.setContentView(dialogPolitAgree)
                    myDialogPolitAgree.setCancelable(true)
                    myDialogPolitAgree.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    myDialogPolitAgree.show()
                    val okBTN = dialogPolitAgree.findViewById<Button>(R.id.buttonOkPolitAgree)
                    okBTN.setOnClickListener{
                        myDialogPolitAgree.dismiss()
                    }
                }
                else
                {
                    editor.putString("ima",vvodDanBinding.textFieldIma.text.toString())
                    editor.putString("familiya", vvodDanBinding.textFieldFamiliya.text.toString())
                    editor.apply()
                    val users = Users(null, vvodDanBinding.textFieldIma.text.toString(), vvodDanBinding.textFieldFamiliya.text.toString(), vvodDanBinding.textFieldPhone.text.toString(), vvodDanBinding.textFieldLoginEmail.text.toString(), vvodDanBinding.textFieldLoginPassword.text.toString())
                    Thread{
                        db.getDao().insertItem(users)
                    }.start()
                    Global().userId++
                    Global().upToDateUserId = Global().userId
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        vvodDanBinding.buttonPhotoDownload.setOnClickListener{
            val sharedIm = getSharedPreferences("mySharedIm", Context.MODE_PRIVATE)
            val editor = sharedIm.edit()
            editor.putInt("man",R.drawable.man)
            editor.apply()
            vvodDanBinding.buttonPhotoDownload.setImageResource(R.drawable.man)
        }
    }
}