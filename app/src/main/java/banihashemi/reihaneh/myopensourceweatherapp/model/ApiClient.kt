package banihashemi.reihaneh.myopensourceweatherapp.model

import retrofit2.Response

class ApiClient(private val apiService: ApiService) {
    suspend fun getWeatherData(lat:Double,long:Double): SimpleResponse<List<WeatherDataClass>> {
        return safeApiCall { apiService.getWeatherData(lat,long) }
    }

  private  inline fun<T> safeApiCall(apiCall: ()->Response<T>):SimpleResponse<T>{
      return try {
          SimpleResponse.success(apiCall.invoke())
      }catch (e:Exception){
          SimpleResponse.failure(e)
      }
  }

}
