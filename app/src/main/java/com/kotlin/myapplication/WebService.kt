package com.kotlin.myapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("/search/users")
    fun retrieveUser(@Query("q") text : String) : Call<List<ResponseDao>>

}