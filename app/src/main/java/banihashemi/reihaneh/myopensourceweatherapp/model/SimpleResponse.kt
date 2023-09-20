package banihashemi.reihaneh.myopensourceweatherapp.model

import retrofit2.Response
import java.lang.Exception

data class SimpleResponse<T>(
    val status:Status,
    val data:Response<T>?,
    val exception: Exception?

){
    companion object{
        fun <T> success(data:Response<T>):SimpleResponse<T>{
            return SimpleResponse(
                status = Status.sucsess,
                data =data,
                exception =  null
            )
        }

        fun <T> failure(exception: Exception):SimpleResponse<T>{
            return SimpleResponse(
                status = Status.failure,
                data =null,
                exception =  exception
            )
        }
    }
    sealed class Status{
        object sucsess:Status()
        object failure:Status()
    }

    val failed:Boolean
    get() = this.status==Status.failure

    val isSuccessful:Boolean
    get() =!failed && this.data?.isSuccessful==true

    val body:T
    get() = this.data!!.body()!!
}
