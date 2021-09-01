package com.mad_assingment.practical11apidemo.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetofitInstance {
    private val retofit by lazy {
        Retrofit.Builder()
            .baseUrl(MyRestAPI.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: MyRestAPI by lazy {
        retofit.create(MyRestAPI::class.java)
    }



}