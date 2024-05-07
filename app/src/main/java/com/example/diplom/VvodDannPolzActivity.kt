package com.example.diplom

import androidx.activity.ComponentActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
class VvodDannPolzActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vvod_dannih_polz)
        val regBTN: Button = findViewById(R.id.buttonRegistration)
        regBTN.setOnClickListener{
            val intent = Intent(this, VvodDannPolzActivity::class.java)
            startActivity(intent)
        }
        //val catBTN: ImageView = findViewById(R.id.cat)
        //catBTN.setOnClickListener{
        //    val intent = Intent(this, CatalogActivity::class.java)
        //    startActivity(intent)
        //}
    }
}