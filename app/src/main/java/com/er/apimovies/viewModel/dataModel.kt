package com.er.apimovies.viewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.er.apimovies.model.RetrofitInstance
import com.er.apimovies.model.dataModels


import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {

    private val _movies= mutableStateOf<List<dataModels>>(emptyList())
    val movies: State<List<dataModels>> = _movies
    private val apiKey = "3504def2d1ea52a662d62df463822ca4"
    init {
        fetchMovies()
    }

    private fun fetchMovies(){
        viewModelScope.launch {
            try{
                val response = RetrofitInstance.api.getPopularMovies(apiKey)
                if (response.isSuccessful) {
                    _movies.value = response.body()?.results ?: emptyList()
                }
            }catch (e: Exception){
                e.message
            }
            }
        }
}