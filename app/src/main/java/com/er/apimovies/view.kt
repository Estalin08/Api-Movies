package com.er.apimovies

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.er.apimovies.model.dataModels
import com.er.apimovies.viewModel.PostViewModel



@Composable
fun view(viewModel: PostViewModel = viewModel()) {
    val movies by viewModel.movies

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(movies) { movie ->
            MovieItem(movie = movie)
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
fun MovieItem(movie: dataModels) {
    Row(modifier = Modifier.fillMaxWidth()) {
        val imageUrl = "https://image.tmdb.org/t/p/w500${movie.poster_path}"

        Image(
            painter = rememberImagePainter(data = imageUrl),
            contentDescription = movie.title,
            modifier = Modifier
                .size(100.dp)
                .padding(end = 8.dp)
        )

        Column(modifier = Modifier.fillMaxWidth()) {
            Text(text = movie.title, style = MaterialTheme.typography.titleLarge)
            Text(text = movie.overview, maxLines = 3, style = MaterialTheme.typography.bodyLarge)
            }
        }
}