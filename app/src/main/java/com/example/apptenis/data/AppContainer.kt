package com.example.apptenis.data

import android.content.Context
import androidx.room.Room

class AppContainer(context: Context) {
    private val database: TenisDatabase by lazy {
        Room.databaseBuilder(context, TenisDatabase::class.java, "banco_tenis").build()
    }

    val tenisRepository: TenisRepository by lazy {
        TenisRepository(database.tenisDao())
    }
}