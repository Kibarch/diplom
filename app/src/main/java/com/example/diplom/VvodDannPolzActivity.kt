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
                    val users = Users(null, vvodDanBinding.textFieldIma.text.toString(), vvodDanBinding.textFieldFamiliya.text.toString(), vvodDanBinding.textFieldPhone.text.toString(), vvodDanBinding.textFieldLoginEmail.text.toString(), vvodDanBinding.textFieldLoginPassword.text.toString())
                    val thread  = Thread{db.getDao().insertItem(users)}
                    thread.start()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    thread.stop()
                }
            }
        }
        vvodDanBinding.buttonPhotoDownload.setOnClickListener{
            vvodDanBinding.buttonPhotoDownload.setImageResource(R.drawable.man)
        }
    }
}