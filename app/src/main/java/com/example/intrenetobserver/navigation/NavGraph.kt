package com.example.intrenetobserver.navigation


import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@Composable
fun SetNavGraph(
    navHostController: NavHostController,
    context: Context
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route,
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navHostController = navHostController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(DETAIL_ARGUMENT_ID) {
                type = NavType.IntType
            })
        ) {
            Toast.makeText(
                context.applicationContext,
                it.arguments?.getInt(DETAIL_ARGUMENT_ID).toString(),
                Toast.LENGTH_SHORT
            ).show()
            DetailScreen(navHostController = navHostController)
        }
    }
}