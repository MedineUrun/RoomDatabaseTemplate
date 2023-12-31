package com.example.roomdatabasetemplate.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.roomdatabasetemplate.data.entitiy.User

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Query("SELECT* FROM user;")
    suspend fun getAll():List<User>

    @Query("SELECT * FROM User WHERE id = :id")
    suspend fun getUserById(id:Int):User

    @Update
    suspend fun update(user: User)

    @Delete
    suspend fun delete(user:User)
}