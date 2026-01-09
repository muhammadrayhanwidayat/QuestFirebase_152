@file:OptIn(InternalSerializationApi::class)
package com.example.questfirebase_152.viewmodel


import com.example.questfirebase_152.modeldata.Siswa
import kotlinx.serialization.InternalSerializationApi
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.questfirebase_152.repositori.RepositorySiswa
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.questfirebase_152.view.route.DestinasiDetail
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

