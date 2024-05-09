package com.example.diplom

import android.app.Application

class Global : Application()
{
     var stockIma : String = "Имя"
     var stockFamiliya : String = "Фамилия"
     lateinit var polzName : String
     lateinit var polzFamil : String
     var flag : Int = 0
}