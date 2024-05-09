package com.example.diplom

import android.app.Dialog
import android.content.Context
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import android.widget.EditText

class VvodDannPolzActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vvod_dannih_polz)
        val textIma : EditText = findViewById(R.id.textFieldIma)
        val textFamiliya : EditText = findViewById(R.id.textFieldFamiliya)

        val regBTN: Button = findViewById(R.id.buttonRegistration)
        regBTN.setOnClickListener{
            val ima : String = textIma.text.toString()
            val familiya : String = textFamiliya.text.toString()
            val sharedPref = getSharedPreferences("mySharedPref", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.putString("ima",ima)
            editor.putString("familiya", familiya)
            editor.apply()
            if (ima == "" || familiya == "")
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
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
        //val catBTN: ImageView = findViewById(R.id.cat)
        //catBTN.setOnClickListener{
        //    val intent = Intent(this, CatalogActivity::class.java)
        //    startActivity(intent)
        //}
    }
}