package com.example.apptenis.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apptenis.data.TenisRepository
import com.example.apptenis.data.Tenis
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class TenisViewModel(private val repository: TenisRepository) : ViewModel() {

    val tenisList: Flow<List<Tenis>> = repository.getAllTenis()

    fun getTenisById(id: Int): Flow<Tenis> = repository.getTenisById(id)

    fun addOrUpdateTenis(id: Int? = null, nome: String, idade: Int, genero: String, profissao: String, nacionalidade: String) {
        val tenis = Tenis(id = id ?: 0, marca = nome,  tamanho = idade, modelo = genero, cor = profissao, material = nacionalidade)
        viewModelScope.launch {
            repository.insertTenis(tenis)
        }
    }

    fun deleteTenis(tenis: Tenis) {
        viewModelScope.launch {
            repository.deleteTenis(tenis)
        }
    }
}
