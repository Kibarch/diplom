package com.example.diplom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.asLiveData
import com.example.diplom.databinding.WorkWithDbBinding

class WorkWithDB : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val binding : WorkWithDbBinding = WorkWithDbBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = MainDB.getDb(this)
        db.getDao().getAllItem().asLiveData().observe(this){list->
            binding.tvList.text = ""
            list.forEach{

                val text = "Id: ${it.id} Name: ${it.name} Famil: ${it.famil} Tel:${it.telephone} Email:${it.email} Passw:${it.password}\n"
                binding.tvList.append(text)
            }
        }
        binding.button2.setOnClickListener{
            val users = Users(null, binding.poleIma.text.toString(), binding.poleFamiliya.text.toString(), binding.poleTel.text.toString(), binding.poleEmail.text.toString(), binding.polePassw.text.toString())
            val th = Thread{
                db.getDao().insertItem(users)
            }
            th.start()
            if (!th.isInterrupted)
                th.interrupt()
        }
        binding.button3.setOnClickListener {
            val thh = Thread{
                var textId: String = binding.poleID.text.toString()
                var id: Int = textId.toInt()
                db.getDao().deleteItem(id)
            }
            thh.start()
            if (!thh.isInterrupted)
                thh.interrupt()
        }
    }
}