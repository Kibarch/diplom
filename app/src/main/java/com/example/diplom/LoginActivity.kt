package com.example.diplom

import android.app.Dialog
import android.content.Context
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import androidx.lifecycle.asLiveData
import com.example.diplom.databinding.LoginBinding

class LoginActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val loginBinding : LoginBinding = LoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        val db = MainDB.getDb(this)
        loginBinding.buttonHidePass.setOnClickListener {
            Global.password = loginBinding.textFieldLoginPassword.text.toString()
            loginBinding.textFieldLoginPassword.text.clear()
            var i = 1
            while (i < Global.password.length) {
                loginBinding.textFieldLoginPassword.text.append("*")
                i += 1
            }
        }
        loginBinding.buttonPozakPass.setOnClickListener {
            loginBinding.textFieldLoginPassword.setText(Global.password)
        }
        loginBinding.buttonVoiti.setOnClickListener{
            var flag = 0
            val thread1 = Thread{db.getDao().getAllItem().asLiveData().observe(this) { list ->
                list.forEach {
                    if (it.email.toString()
                            .compareTo(loginBinding.textFieldLoginEmail.text.toString()) == 0 && it.password.toString()
                            .compareTo(loginBinding.textFieldLoginPassword.text.toString()) == 0
                    ) {
                        //Global.flagImaFamCheck = 1
                        flag = 1
                        Global.userId = it.id!!
                        val sharedFlag : SharedPreferences = getSharedPreferences("sharedflag", Context.MODE_PRIVATE)
                        val editor = sharedFlag.edit()
                        editor.putInt("flag",flag)
                        editor.apply()
                    }
                }
            }}
            thread1.start()
            val sharedFlag : SharedPreferences = getSharedPreferences("sharedflag", Context.MODE_PRIVATE)
            if (!thread1.isInterrupted)
            {
                thread1.interrupt()
                if (flag == 0)
                {
                    val dialogPolzNotFound = layoutInflater.inflate(R.layout.null_fields_login_dialog_window, null)
                    val myDialogPolzNotFound = Dialog(this)
                    myDialogPolzNotFound.setContentView(dialogPolzNotFound)
                    myDialogPolzNotFound.setCancelable(true)
                    myDialogPolzNotFound.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    myDialogPolzNotFound.show()
                    val okBTN = dialogPolzNotFound.findViewById<Button>(R.id.buttonOkNevLogPar)
                    okBTN.setOnClickListener {
                        myDialogPolzNotFound.dismiss()
                    }
                }
                else
                {
                    val intent = Intent(this, KartaMagazinovActivity::class.java)
                    startActivity(intent)
                }
                //sharedFlag.getInt("flag",0)
            }
        }
    }
}