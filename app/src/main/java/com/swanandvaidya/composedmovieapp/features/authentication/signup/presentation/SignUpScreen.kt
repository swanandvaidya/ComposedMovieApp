package com.swanandvaidya.composedmovieapp.features.authentication.signup.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.swanandvaidya.composedmovieapp.R
import com.swanandvaidya.composedmovieapp.features.authentication.signup.domain.SingUpViewModel

@Composable
fun SignUpScreen(
    navHostController: NavHostController
) {
    val signupViewModel: SingUpViewModel = viewModel()
    signupViewModel.isEmailValid.observeAsState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.color_background)),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.bg_image),
            contentDescription = "Welcome screen image"
        )
        Column(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                )
                .fillMaxWidth()
                .padding(all = 20.dp)
        ) {
            Text(
                text = "Email",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(30.dp),
                placeholder = {
                    Text(
                        text = "your email",
                        color = Color.LightGray,
                        fontSize = 16.sp
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(id = R.color.color_orange),
                    focusedBorderColor = colorResource(id = R.color.color_orange),
                )
            )

            Text(
                text = "Password",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 30.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(30.dp),
                placeholder = {
                    Text(
                        text = "password",
                        color = Color.LightGray,
                        fontSize = 16.sp
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(id = R.color.color_orange),
                    focusedBorderColor = colorResource(id = R.color.color_orange),
                )
            )

            Text(
                text = "Mobile Number",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 30.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(30.dp),
                placeholder = {
                    Text(
                        text = "mobile number",
                        color = Color.LightGray,
                        fontSize = 16.sp
                    )
                },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(id = R.color.color_orange),
                    focusedBorderColor = colorResource(id = R.color.color_orange),
                )
            )

            Button(
                onClick = {},
                enabled = false,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.color_orange)
                )
            ) {
                Text(
                    text = "Signup",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(4.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Already have account?",
                    fontSize = 16.sp
                )
                Text(
                    text = "Login",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(start = 4.dp),
                    color = colorResource(id = R.color.color_orange)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSignUpScreen() {
    SignUpScreen(navHostController = rememberNavController())
}