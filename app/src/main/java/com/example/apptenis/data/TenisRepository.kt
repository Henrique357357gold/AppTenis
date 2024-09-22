package com.example.apptenis.data

import kotlinx.coroutines.flow.Flow

open class TenisRepository(private val tenisDao: TenisDao) {
    fun getAllTenis(): Flow<List<Tenis>> = tenisDao.getAllTenis()

    fun getTenisById(id: Int): Flow<Tenis> = tenisDao.getTenisById(id)

    suspend fun insertTenis(tenis: Tenis) = tenisDao.insertTenis(tenis)

    suspend fun deleteTenis(tenis: Tenis) = tenisDao.deleteTenis(tenis)
}
