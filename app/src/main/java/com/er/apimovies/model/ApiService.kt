package com.er.apimovies.model

import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<dataApi>
}