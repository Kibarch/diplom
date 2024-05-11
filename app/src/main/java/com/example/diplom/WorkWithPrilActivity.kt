package com.example.diplom
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.diplom.databinding.WorkWithPrilBinding

class WorkWithPrilActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val workWithPrilBinding : WorkWithPrilBinding = WorkWithPrilBinding.inflate(layoutInflater)
        setContentView(workWithPrilBinding.root)
    }
}