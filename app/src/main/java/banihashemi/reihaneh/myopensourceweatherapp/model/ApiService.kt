package banihashemi.reihaneh.myopensourceweatherapp.model

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v1/forecast?latitude=34.64&longitude=50.87&daily=weathercode,temperature_2m_max,temperature_2m_min,apparent_temperature_max,apparent_temperature_min,sunrise,sunset,precipitation_sum,rain_sum,showers_sum,snowfall_sum,precipitation_hours,windspeed_10m_max,windgusts_10m_max,winddirection_10m_dominant,shortwave_radiation_sum,et0_fao_evapotranspiration&current_weather=true&timeformat=unixtime&timezone=auto")
    suspend fun  getWeatherData( @Query("latitude") lat:Double,@Query("longitude") long:Double): Response<List<WeatherDataClass>>
}