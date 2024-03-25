package com.swanandvaidya.composedmovieapp.utility

sealed class AppScreens(val route: String) {
    object WelcomeScreen : AppScreens(ScreenRoute.WELCOME.name)
    object SignInScreen : AppScreens(ScreenRoute.SIGNIN.name)
    object SignUpScreen : AppScreens(ScreenRoute.SIGNUP.name)
    object ForgotPasswordScreen : AppScreens(ScreenRoute.FORGOTPASSWORD.name)
}

enum class ScreenRoute {
    WELCOME,
    SIGNIN,
    SIGNUP,
    FORGOTPASSWORD
}