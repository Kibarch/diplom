package com.example.diplom

import android.content.Context
import android.content.Intent
import android.os.Bundle
import  androidx.activity.ComponentActivity
import com.example.diplom.databinding.OformleniezakazaBinding
class OformlenieZakazaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val oformleniezakazaBinding: OformleniezakazaBinding = OformleniezakazaBinding.inflate(layoutInflater)
        setContentView(oformleniezakazaBinding.root)
        val sharedAdress = getSharedPreferences("mySharedAdress", Context.MODE_PRIVATE)
        var adress = sharedAdress.getString("adress", "")
        oformleniezakazaBinding.adres.text = adress
        oformleniezakazaBinding.deliveryadres.text = adress
    }
}