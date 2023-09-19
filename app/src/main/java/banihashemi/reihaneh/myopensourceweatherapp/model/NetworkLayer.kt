package banihashemi.reihaneh.myopensourceweatherapp.model

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkLayer {

    val retrofit:Retrofit=Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val apiService:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    val apiClient=ApiClient(apiService)


}