package banihashemi.reihaneh.myopensourceweatherapp.mainScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import banihashemi.reihaneh.myopensourceweatherapp.model.MainRepository
import banihashemi.reihaneh.myopensourceweatherapp.model.WeatherDataClass
import kotlinx.coroutines.launch

class MainScreenViewModel():ViewModel() {

    private val repository=MainRepository()

    private val _weatherLiveData= MutableLiveData<WeatherDataClass?>()
    val weatherLiveData:LiveData<WeatherDataClass?> =_weatherLiveData

    fun refreshWeatherData(lat:Double,long:Double){
        viewModelScope.launch {
            val response=repository.getWeatherData(lat, long)
            _weatherLiveData.postValue(response)
        }
    }
}