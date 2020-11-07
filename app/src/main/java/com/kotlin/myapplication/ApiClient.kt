package com.kotlin.myapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

   private const val baseUrl: String = "https://api.github.com/"

    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val webService : WebService = retrofit.create(WebService::class.java)
}