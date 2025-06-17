package com.er.apimovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.er.apimovies.ui.theme.ApiMoviesTheme
import com.er.apimovies.view.pantallaInicio
import com.er.apimovies.view.view
import com.er.apimovies.viewModel.navegacion.navegacion

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            ApiMoviesTheme {
                navegacion()
            }
        }
    }
}

@Composable
fun text(){

    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){

        Text(
            text = "hola estalin",
            fontSize = 40.sp
        )
    }

}