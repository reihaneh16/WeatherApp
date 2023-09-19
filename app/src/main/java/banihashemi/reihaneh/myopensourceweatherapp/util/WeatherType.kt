package banihashemi.reihaneh.myopensourceweatherapp.util

import androidx.annotation.RawRes
import banihashemi.reihaneh.myopensourceweatherapp.R

sealed class WeatherType(
    val weatherDesc: String,
    @RawRes val iconRes: Int
) {
    object ClearSky : WeatherType(
        weatherDesc = "آسمان صاف",
        iconRes = R.raw.clearday
    )
    object MainlyClear : WeatherType(
        weatherDesc = "آسمان نسبتا صاف",
        iconRes =R.raw.cloudy
    )
    object PartlyCloudy : WeatherType(
        weatherDesc = "نیمه ابری",
        iconRes = R.raw.cloudy
    )
    object Overcast : WeatherType(
        weatherDesc = "ابری",
        iconRes = R.raw.cloudy
    )
    object Foggy : WeatherType(
        weatherDesc = "مه آلود",
        iconRes = R.raw.verycloudy
    )
    object DepositingRimeFog : WeatherType(
        weatherDesc = "Depositing rime fog",
        iconRes = R.raw.verycloudy
    )
    object LightDrizzle : WeatherType(
        weatherDesc = " نم نم باران خفیف",
        iconRes = R.raw.rainshower
    )
    object ModerateDrizzle : WeatherType(
        weatherDesc = "نم نم باران متوسط",
        iconRes = R.raw.rainshower
    )
    object DenseDrizzle : WeatherType(
        weatherDesc = "نم نم باران متراکم",
        iconRes =R.raw.rainshower
    )
    object LightFreezingDrizzle : WeatherType(
        weatherDesc = "Slight freezing drizzle",
        iconRes = R.raw.snowyrainy
    )
    object DenseFreezingDrizzle : WeatherType(
        weatherDesc = "Dense freezing drizzle",
        iconRes = R.raw.snowyrainy
    )
    object SlightRain : WeatherType(
        weatherDesc = "باران خفیف",
        iconRes = R.raw.rain
    )
    object ModerateRain : WeatherType(
        weatherDesc = "بارانی",
        iconRes = R.raw.rain
    )
    object HeavyRain : WeatherType(
        weatherDesc = "باران سنگین",
        iconRes = R.raw.rain
    )
    object HeavyFreezingRain: WeatherType(
        weatherDesc = "Heavy freezing rain",
        iconRes = R.raw.snowyrainy
    )
    object SlightSnowFall: WeatherType(
        weatherDesc = "بارش خفیف برف",
        iconRes =R.raw.snow
    )
    object ModerateSnowFall: WeatherType(
        weatherDesc = "بارش متوسط برف ",
        iconRes = R.raw.heavysnow
    )
    object HeavySnowFall: WeatherType(
        weatherDesc = "بارش سنگین برف",
        iconRes =R.raw.heavysnow
    )
    object SnowGrains: WeatherType(
        weatherDesc = "Snow grains",
        iconRes = R.raw.heavysnow
    )
    object SlightRainShowers: WeatherType(
        weatherDesc = "Slight rain showers",
        iconRes = R.raw.rainshower
    )
    object ModerateRainShowers: WeatherType(
        weatherDesc = "Moderate rain showers",
        iconRes = R.raw.rainshower
    )
    object ViolentRainShowers: WeatherType(
        weatherDesc = "Violent rain showers",
        iconRes =R.raw.rainshower
    )
    object SlightSnowShowers: WeatherType(
        weatherDesc = "Light snow showers",
        iconRes = R.raw.snow
    )
    object HeavySnowShowers: WeatherType(
        weatherDesc = "Heavy snow showers",
        iconRes = R.raw.snow
    )
    object ModerateThunderstorm: WeatherType(
        weatherDesc = "Moderate thunderstorm",
        iconRes = R.raw.thunder
    )
    object SlightHailThunderstorm: WeatherType(
        weatherDesc = "Thunderstorm with slight hail",
        iconRes =R.raw.rainythunder
    )
    object HeavyHailThunderstorm: WeatherType(
        weatherDesc = "Thunderstorm with heavy hail",
        iconRes = R.raw.rainythunder
    )

    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when(code) {
                0 -> ClearSky
                1 -> MainlyClear
                2 -> PartlyCloudy
                3 -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> LightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> LightFreezingDrizzle
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowFall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightHailThunderstorm
                99 -> HeavyHailThunderstorm
                else -> ClearSky
            }
        }
    }
}

