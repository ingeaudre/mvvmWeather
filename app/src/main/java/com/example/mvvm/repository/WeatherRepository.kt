package com.example.mvvm.repository

import com.example.mvvm.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService){

    suspend fun getWeather() = apiService.getWeather()
}

