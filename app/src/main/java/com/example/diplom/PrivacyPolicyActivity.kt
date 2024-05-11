package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.PrivacyPolicyBinding

class PrivacyPolicyActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val privacyPolicyBinding : PrivacyPolicyBinding = PrivacyPolicyBinding.inflate(layoutInflater)
        setContentView(privacyPolicyBinding.root)
    }
}