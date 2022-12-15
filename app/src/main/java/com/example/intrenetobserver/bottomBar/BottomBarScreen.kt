package com.example.intrenetobserver.bottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val router: String,
    val title: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        router = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : BottomBarScreen(
        router = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Setting : BottomBarScreen(
        router = "setting",
        title = "Setting",
        icon = Icons.Default.Settings
    )
}