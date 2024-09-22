package com.example.apptenis.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Tenis::class], version = 1, exportSchema = false)
abstract class TenisDatabase : RoomDatabase() {
    abstract fun tenisDao(): TenisDao
}
