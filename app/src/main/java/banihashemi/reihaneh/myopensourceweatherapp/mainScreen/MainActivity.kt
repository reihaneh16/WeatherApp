package banihashemi.reihaneh.myopensourceweatherapp.mainScreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import banihashemi.reihaneh.myopensourceweatherapp.R

class MainActivity : AppCompatActivity() {

    val viewModel:MainScreenViewModel by lazy {
        ViewModelProvider(this).get(MainScreenViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.refreshWeatherData(34.58,50.87)
        viewModel.weatherLiveData.observe(this){
            if (it==null){
                Toast.makeText(this@MainActivity,"Unsuccessfull Network Call",Toast.LENGTH_LONG).show()
                return@observe
            }

            Toast.makeText(this@MainActivity, "Successfull Response", Toast.LENGTH_LONG).show()
            Log.i("TAG",it.toString())
        }


    }
}