package com.er.apimovies.model

data class MovieResponse(
    val results: List<dataModels>
)
data class dataModels(
    val id: Int,
    val title: String,
    val overview: String,
    val poster_path:String
)