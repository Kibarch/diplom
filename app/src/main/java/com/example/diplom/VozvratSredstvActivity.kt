package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.VozvratSredstvBinding

class VozvratSredstvActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vozvratSredstvBinding : VozvratSredstvBinding = VozvratSredstvBinding.inflate(layoutInflater)
        setContentView(vozvratSredstvBinding.root)
    }
}