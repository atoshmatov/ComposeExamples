package com.example.intrenetobserver.network

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {
    fun observer(): Flow<Status>


    enum class Status {
        Available, UnAvailable, Lost, Losing
    }
}