package com.example.diplom

import android.app.Dialog
import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
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
            db.getDao().getAllItem().asLiveData().observe(this){list->
                //loginBinding.textView3.text = ""
                list.forEach{
                    //val text = "flag: $flag Id: ${it.id} GlobalId: ${Global.userId} emailtext:${loginBinding.textFieldLoginEmail.text} passwordText: ${loginBinding.textFieldLoginPassword.text} Email:${it.email} Passw:${it.password}\n"
                    //loginBinding.textView3.append(text)
                    if (it.email.toString().compareTo(loginBinding.textFieldLoginEmail.text.toString()) == 0 && it.password.toString().compareTo(loginBinding.textFieldLoginPassword.text.toString()) == 0)
                    {
                        flag = 1
                        Global.userId = it.id!!
                        //loginBinding.textView3.append("currentID: ${it.id} GlobalId: ${Global.userId} flag: $flag")
                    }
                    //val text = "Id: ${it.id} Name: ${it.name} Famil: ${it.famil} Tel:${it.telephone} Email:${it.email} Passw:${it.password}\n"
                }
                if (flag == 1)
                {
                    val intent = Intent(this, MagaziniActivity::class.java)
                    startActivity(intent)
                    //loginBinding.textView3.append("globalid: ${Global.userId}")
                }
                else
                {
                    val dialogPolzNotFound=layoutInflater.inflate(R.layout.null_fields_login_dialog_window, null)
                    val myDialogPolzNotFound= Dialog(this)
                    myDialogPolzNotFound.setContentView(dialogPolzNotFound)
                    myDialogPolzNotFound.setCancelable(true)
                    myDialogPolzNotFound.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    myDialogPolzNotFound.show()
                    val okBTN = dialogPolzNotFound.findViewById<Button>(R.id.buttonOkNevLogPar)
                    okBTN.setOnClickListener{
                        myDialogPolzNotFound.dismiss()
                    }
                }
            }
        }
    }
}