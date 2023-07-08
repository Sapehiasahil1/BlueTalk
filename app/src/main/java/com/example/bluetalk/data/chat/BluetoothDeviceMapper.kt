package com.example.bluetalk.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.example.bluetalk.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}