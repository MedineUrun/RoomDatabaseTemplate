package com.example.roomdatabasetemplate.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabasetemplate.data.dao.UserDao
import com.example.roomdatabasetemplate.data.entitiy.User

@Database(
    entities = [User::class],
    version = 1
)

abstract class AppDatabase: RoomDatabase(){
    abstract fun userDao(): UserDao
}