package com.example.apptenis.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface TenisDao {
    @Query("SELECT * FROM tenis")
    fun getAllTenis(): Flow<List<Tenis>>

    @Query("SELECT * FROM tenis WHERE id = :id")
    fun getTenisById(id: Int): Flow<Tenis>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTenis(tenis: Tenis)

    @Delete
    suspend fun deleteTenis(tenis: Tenis)
}
