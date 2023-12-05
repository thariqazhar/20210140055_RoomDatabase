package com.example.repositori.model

import androidx.lifecycle.ViewModel
import com.example.repositori.repo.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa) : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}