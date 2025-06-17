package com.er.apimovies.viewModel.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.er.apimovies.view.pantallaInicio
import com.er.apimovies.view.view

sealed class Screen( val route: String){

    object pantallaInicio: Screen(route="inicio")
    object segundaPntalla: Screen(route = "pantalla2")

}

@Composable
@Preview(showBackground = true)
fun navegacion(){
    val navController= rememberNavController()

    NavHost(navController=navController, startDestination = Screen.pantallaInicio.route){

        composable (Screen.pantallaInicio.route){
            pantallaInicio(navController)

        }
        composable(Screen.segundaPntalla.route){

            view( viewModel(), navController)
        }

    }

}