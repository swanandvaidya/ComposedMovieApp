package com.swanandvaidya.composedmovieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.swanandvaidya.composedmovieapp.navigation.MovieAppNavigation
import com.swanandvaidya.composedmovieapp.ui.theme.ComposedMovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposedMovieAppTheme {
                MovieAppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieAppNavigation()
}