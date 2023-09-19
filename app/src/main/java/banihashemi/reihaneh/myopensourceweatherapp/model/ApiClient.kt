package banihashemi.reihaneh.myopensourceweatherapp.model

import retrofit2.Response

class ApiClient(private val apiService: ApiService) {
    suspend fun getWeatherData(lat:Double,long:Double): Response<List<WeatherDataClass>> {
        return apiService.getWeatherData(lat, long)
    }

}
