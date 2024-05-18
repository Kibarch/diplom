package com.example.diplom

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.DeliveryBinding

class DeliveryActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val deliveryBinding : DeliveryBinding = DeliveryBinding.inflate(layoutInflater)
        setContentView(deliveryBinding.root)
    }
}