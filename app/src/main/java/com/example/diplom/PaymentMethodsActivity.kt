package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.PaymentMethodsBinding

class PaymentMethodsActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val paymentMethodsBinding : PaymentMethodsBinding = PaymentMethodsBinding.inflate(layoutInflater)
        setContentView(paymentMethodsBinding.root)
    }
}