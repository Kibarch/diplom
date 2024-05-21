package com.example.diplom

import android.app.Application

class Global : Application()
{
     companion object{
          var stockIma : String = "Имя"
          var stockFamiliya : String = "Фамилия"
          lateinit var polzName : String
          lateinit var polzFamil : String
          var imProf : Int = R.drawable.image1
          var userId = 0
          var flagZaregPoz : Int = 0
          var flagImaFamCheck : Int = 0
          var password  = ""
     }

}