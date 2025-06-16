package com.er.apimovies.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("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")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}