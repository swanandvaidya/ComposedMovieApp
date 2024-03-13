package com.swanandvaidya.composedmovieapp.features.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.swanandvaidya.composedmovieapp.R

@Composable
fun WelcomeScreen() {
    Box (
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.color_background))
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.bg_image),
            contentDescription = "Welcome screen image"
        )
        Column(
            modifier = Modifier
                .background(color = colorResource(id = R.color.color_background))
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Text(
                text ="Discover Your",
                fontSize = 24.sp,
                color = Color.White
            )
            Text(
                text ="Favourites Show",
                fontSize = 24.sp,
                color = colorResource(id = R.color.color_orange)
            )
            Text(
                text ="Watch Now or Watch Later",
                fontSize = 24.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text ="You can browse movies and shows by genre, search for specific title, or check out our recommendation for you.",
                fontSize = 18.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.color_orange)
                )
            ) {
                Text(
                    text = "Get Started",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen()
}