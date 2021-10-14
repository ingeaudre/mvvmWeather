package com.example.mvvm.api

import com.example.mvvm.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Medan")
    suspend fun getWeather():Response<Weather>
}