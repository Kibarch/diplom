package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.WorkWithAccountBinding

class WorkWithAccountActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val workWithAccountBinding : WorkWithAccountBinding = WorkWithAccountBinding.inflate(layoutInflater)
        setContentView(workWithAccountBinding.root)
    }
}