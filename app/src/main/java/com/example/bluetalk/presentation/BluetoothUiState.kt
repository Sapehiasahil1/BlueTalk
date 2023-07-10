package com.example.bluetalk.presentation

import com.example.bluetalk.domain.chat.BluetoothDevice
import com.example.bluetalk.domain.chat.BluetoothMessage

data class BluetoothUiState(
    val scannedDevices : List<BluetoothDevice> = emptyList(),
    val pairedDevices : List<BluetoothDevice> = emptyList(),
    val isConnected : Boolean  = false,
    val isConnecting : Boolean = false,
    val errorMessage : String? = null,
    val messages : List<BluetoothMessage> = emptyList()
)
