package com.example.diplom

import android.app.Application
import kotlin.properties.Delegates

class Global : Application()
{
     var stockIma : String = "Имя"
     var stockFamiliya : String = "Фамилия"
     lateinit var polzName : String
     lateinit var polzFamil : String
     var imProf : Int = R.drawable.image1
     var flag : Int = 0
}