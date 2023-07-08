package com.example.bluetalk.domain.chat

// This depicts the second name of the BluetoothDevice class we used. We gave this class a
// second name because there is a default class in Android SDK with the same name.
typealias BluetoothDeviceDomain = BluetoothDevice

data class BluetoothDevice(
    // It represents the name that is visible on the bluetooth
    val name : String?,
    // It is the MAC address of the device
    val address: String
)
