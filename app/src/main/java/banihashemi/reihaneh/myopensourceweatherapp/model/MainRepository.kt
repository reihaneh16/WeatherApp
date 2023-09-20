package banihashemi.reihaneh.myopensourceweatherapp.model

import retrofit2.Response

class MainRepository {

    suspend fun getWeatherData(lat:Double,long:Double): List<WeatherDataClass>? {
        val request= NetworkLayer.apiClient.getWeatherData(lat, long )


        if (request.failed){
            return null
        }
        if (!request.isSuccessful){
            return null
        }

        return request.body
    }
}