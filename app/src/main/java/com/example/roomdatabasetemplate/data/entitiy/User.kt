package com.example.roomdatabasetemplate.data.entitiy

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val name:String?,
    val surname:String?
)
