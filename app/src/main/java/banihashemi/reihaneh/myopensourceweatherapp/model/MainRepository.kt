package banihashemi.reihaneh.myopensourceweatherapp.model

import retrofit2.Response

class MainRepository {

    suspend fun getWeatherData(lat:Double,long:Double): WeatherDataClass? {
        val response= NetworkLayer.apiClient.getWeatherData(lat, long )
        if (response.isSuccessful){
            return response.body()
        }
        else
            return null

    }
}