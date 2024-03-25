package com.swanandvaidya.composedmovieapp

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.swanandvaidya.composedmovieapp.features.authentication.forgotpassword.ForgotPasswordScreen
import com.swanandvaidya.composedmovieapp.features.authentication.login.LoginScreen
import com.swanandvaidya.composedmovieapp.features.authentication.signup.SignUpScreen
import com.swanandvaidya.composedmovieapp.features.welcome.WelcomeScreen
import com.swanandvaidya.composedmovieapp.utility.AppScreens

@Composable
fun MovieApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.WelcomeScreen.route,
        enterTransition = {
            fadeIn(animationSpec = tween(300)) + slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left, tween(300)
            )
        },
        exitTransition = {
            fadeOut(animationSpec = tween(300)) + slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Left, tween(300)
            )
        },
        popEnterTransition = {
            fadeIn(animationSpec = tween(300)) + slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Right, tween(300)
            )
        },
        popExitTransition = {
            fadeOut(animationSpec = tween(300)) + slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right, tween(300)
            )
        }

    ) {
        composable(route = AppScreens.WelcomeScreen.route) {
            WelcomeScreen {
               navController.navigate(AppScreens.SignInScreen.route) {
                   launchSingleTop = true
               }
            }
        }
        composable(route = AppScreens.SignInScreen.route) {
            LoginScreen(navController)
        }
        composable(route = AppScreens.SignUpScreen.route) {
            SignUpScreen()
        }
        composable(route = AppScreens.ForgotPasswordScreen.route) {
            ForgotPasswordScreen()
        }
    }

}