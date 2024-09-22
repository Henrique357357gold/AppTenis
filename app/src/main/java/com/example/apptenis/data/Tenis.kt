package com.example.apptenis.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tenis")
data class Tenis(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val marca: String,
    val tamanho: Int,
    val modelo: String,
    val cor: String,
    val material: String
)
