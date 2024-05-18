package com.example.diplom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao
{
    @Insert
    fun insertItem(users: Users)
    @Query("SELECT * FROM users")
    fun getAllItem(): Flow<List<Users>>
    @Query("SELECT name FROM users WHERE id = :id")
    fun getName(id: Int?): String
    @Query("SELECT famil FROM users WHERE id = :id")
    fun getFamil(id: Int?): String
    @Query("SELECT email FROM users WHERE id = :id")
    fun getEmail(id: Int?): String
    @Query("SELECT password FROM users WHERE id = :id")
    fun getPassword(id: Int?): String
    @Query("SELECT email, password FROM users WHERE id = :id")
    fun getEmPas(id: Int?): Flow<List<Users>>
    @Query("DELETE FROM users WHERE id = :id")
    fun deleteItem(id: Int?)

}