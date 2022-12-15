package com.example.intrenetobserver.bottomBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.intrenetobserver.bottomBar.screen.HomeScreen
import com.example.intrenetobserver.bottomBar.screen.ProfileScreen
import com.example.intrenetobserver.bottomBar.screen.SettingScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreen.Home.router) {
        composable(route = BottomBarScreen.Home.router) {
            HomeScreen()
        }

        composable(route = BottomBarScreen.Profile.router) {
            ProfileScreen()
        }

        composable(route = BottomBarScreen.Setting.router) {
            SettingScreen()
        }
    }
}