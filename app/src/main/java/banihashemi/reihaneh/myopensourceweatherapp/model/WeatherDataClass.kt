package banihashemi.reihaneh.myopensourceweatherapp.model

import com.google.gson.annotations.SerializedName

data class WeatherDataClass (

        @SerializedName("latitude"              ) var latitude             : Double?         = null,
        @SerializedName("longitude"             ) var longitude            : Double?         = null,
        @SerializedName("generationtime_ms"     ) var generationtimeMs     : Double?         = null,
        @SerializedName("utc_offset_seconds"    ) var utcOffsetSeconds     : Int?            = null,
        @SerializedName("timezone"              ) var timezone             : String?         = null,
        @SerializedName("timezone_abbreviation" ) var timezoneAbbreviation : String?         = null,
        @SerializedName("elevation"             ) var elevation            : Int?            = null,
        @SerializedName("current_weather"       ) var currentWeather       : CurrentWeather? = CurrentWeather(),
        @SerializedName("daily"                 ) var daily                : Daily?          = Daily()


)

    data class CurrentWeather (

        @SerializedName("temperature"   ) var temperature   : Double? = null,
        @SerializedName("windspeed"     ) var windspeed     : Double? = null,
        @SerializedName("winddirection" ) var winddirection : Int?    = null,
        @SerializedName("weathercode"   ) var weathercode   : Int?    = null,
        @SerializedName("is_day"        ) var isDay         : Int?    = null,
        @SerializedName("time"          ) var time          : Int?    = null

    )

    data class Daily (

        @SerializedName("time"                       ) var time                     : ArrayList<Int>    = arrayListOf(),
        @SerializedName("weathercode"                ) var weathercode              : ArrayList<Int>    = arrayListOf(),
        @SerializedName("temperature_2m_max"         ) var temperature2mMax         : ArrayList<Double> = arrayListOf(),
        @SerializedName("temperature_2m_min"         ) var temperature2mMin         : ArrayList<Double> = arrayListOf(),
        @SerializedName("apparent_temperature_max"   ) var apparentTemperatureMax   : ArrayList<Double> = arrayListOf(),
        @SerializedName("apparent_temperature_min"   ) var apparentTemperatureMin   : ArrayList<Double> = arrayListOf(),
        @SerializedName("sunrise"                    ) var sunrise                  : ArrayList<Int>    = arrayListOf(),
        @SerializedName("sunset"                     ) var sunset                   : ArrayList<Int>    = arrayListOf(),
        @SerializedName("precipitation_sum"          ) var precipitationSum         : ArrayList<Int>    = arrayListOf(),
        @SerializedName("rain_sum"                   ) var rainSum                  : ArrayList<Int>    = arrayListOf(),
        @SerializedName("showers_sum"                ) var showersSum               : ArrayList<Int>    = arrayListOf(),
        @SerializedName("snowfall_sum"               ) var snowfallSum              : ArrayList<Int>    = arrayListOf(),
        @SerializedName("precipitation_hours"        ) var precipitationHours       : ArrayList<Int>    = arrayListOf(),
        @SerializedName("windspeed_10m_max"          ) var windspeed10mMax          : ArrayList<Double> = arrayListOf(),
        @SerializedName("windgusts_10m_max"          ) var windgusts10mMax          : ArrayList<Double> = arrayListOf(),
        @SerializedName("winddirection_10m_dominant" ) var winddirection10mDominant : ArrayList<Int>    = arrayListOf(),
        @SerializedName("shortwave_radiation_sum"    ) var shortwaveRadiationSum    : ArrayList<Double> = arrayListOf(),
        @SerializedName("et0_fao_evapotranspiration" ) var et0FaoEvapotranspiration : ArrayList<Double> = arrayListOf()

    )


