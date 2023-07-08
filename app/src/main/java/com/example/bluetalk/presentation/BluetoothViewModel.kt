package com.example.bluetalk.presentation

import androidx.lifecycle.ViewModel
import com.example.bluetalk.domain.chat.BluetoothController
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class BluetoothViewModel @Inject constructor(
    private val bluetoothController : BluetoothController
) :  ViewModel() {

    private val _state = MutableStateFlow(BluetoothUiState())
}