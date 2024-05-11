package com.example.diplom

import android.app.Dialog
import android.content.Context
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.Image
import android.widget.Button
import android.widget.EditText
import com.example.diplom.databinding.VvodDannihPolzBinding

class VvodDannPolzActivity: ComponentActivity()
{
    private lateinit var vvodDanBinding: VvodDannihPolzBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        vvodDanBinding = VvodDannihPolzBinding.inflate(layoutInflater)
        setContentView(vvodDanBinding.root)
        vvodDanBinding.buttonRegistration.setOnClickListener{
            val sharedPref = getSharedPreferences("mySharedPref", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            if (vvodDanBinding.textFieldIma.text.toString() == "" || vvodDanBinding.textFieldFamiliya.text.toString() == "")
            {
                val dialogNullImaOrFam=layoutInflater.inflate(R.layout.null_ima_or_famil_dialog_window, null)
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
                editor.putString("ima",vvodDanBinding.textFieldIma.text.toString())
                editor.putString("familiya", vvodDanBinding.textFieldFamiliya.text.toString())

                editor.apply()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
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