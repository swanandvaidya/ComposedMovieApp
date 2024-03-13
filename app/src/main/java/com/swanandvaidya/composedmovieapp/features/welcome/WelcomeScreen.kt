package com.swanandvaidya.composedmovieapp.features.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.swanandvaidya.composedmovieapp.R

@Composable
fun WelcomeScreen() {
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.color_background))
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.bg_image),
            contentDescription = "Welcome screen image"
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen()
}