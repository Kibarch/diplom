package com.example.diplom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.asLiveData
import com.example.diplom.databinding.WorkWithDbBinding

class WorkWithDB : ComponentActivity()
{
    private lateinit var binding: WorkWithDbBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = WorkWithDbBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = MainDB.getDb(this)
        db.getDao().getAllItem().asLiveData().observe(this){list->
            binding.tvList.text = ""
            list.forEach{

                val text = "Id: ${it.id} Name: ${it.name} Famil: ${it.famil}\n"
                binding.tvList.append(text)
            }
        }
        binding.button2.setOnClickListener{
            val item = Item(null, binding.poleIma.text.toString(), binding.poleFamiliya.text.toString())
            Thread{
                db.getDao().insertItem(item)
            }.start()

        }
    }
}