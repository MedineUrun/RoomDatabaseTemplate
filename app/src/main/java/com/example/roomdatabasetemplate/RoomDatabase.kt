package com.example.roomdatabasetemplate

import android.content.Context
import androidx.room.Room
import com.example.roomdatabasetemplate.data.AppDatabase

object RoomDatabase {
    fun  getDatabase(context: Context) = Room.databaseBuilder(context,
        AppDatabase::class.java, "database").build()
}