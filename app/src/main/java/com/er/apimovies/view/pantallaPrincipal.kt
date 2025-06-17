package com.er.apimovies.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.er.apimovies.R
import java.nio.file.WatchEvent

@Composable


fun pantallaInicio(navController: NavController){

    Box (modifier = Modifier.fillMaxSize()
        .background(Color(0xFF0E081F))
    ){

        Image(painter = painterResource(R.drawable.pantallainicio), contentDescription = null,
            modifier = Modifier.fillMaxWidth()
                .height(1000.dp)
        )

        TextButton(onClick = {navController.navigate("pantalla2")},
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 250.dp)
            ,

        ) {
            Text(
                    text = "Ir a películas",
                    style = TextStyle(
                        color = Color.Cyan,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        shadow = Shadow(
                            color = Color.Cyan,
                            blurRadius = 25f // Efecto de resplandor
                        ),
                    )


            )
        }

    }
}