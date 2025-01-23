package com.example.uas_pam.ui.viewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.uas_pam.PerpusApplication
import com.example.uas_pam.ui.viewModel.Anggota.InsertAnggotaViewModel
import com.example.uas_pam.ui.viewModel.Anggota.ListAnggotaViewModel
import com.example.uas_pam.ui.viewModel.Buku.DetailBukuViewModel
import com.example.uas_pam.ui.viewModel.Buku.InsertBukuViewModel
import com.example.uas_pam.ui.viewModel.Buku.ListBukuViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            InsertBukuViewModel(perpusApp().container.bukuRepository)
        }
        initializer {
            HomeViewModel()
        }
        initializer {
            ListBukuViewModel(perpusApp().container.bukuRepository)
        }
        initializer {
            InsertAnggotaViewModel(perpusApp().container.anggotaRepository)
        }
        initializer {
            ListAnggotaViewModel(perpusApp().container.anggotaRepository)
        }
        initializer {
            DetailBukuViewModel(
                createSavedStateHandle(),
                perpusApp().container.bukuRepository
            )
        }
    }
}

fun CreationExtras.perpusApp(): PerpusApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as PerpusApplication)