package com.example.diplom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "users")
data class Users(
    @PrimaryKey(autoGenerate = true) var id: Int?,
    @ColumnInfo(name = "name") var name: String?,
    @ColumnInfo(name = "famil") var famil: String?,
    @ColumnInfo(name = "telephone") var telephone: String?,
    @ColumnInfo(name = "email") var email: String?,
    @ColumnInfo(name = "password") var password: String?

)
