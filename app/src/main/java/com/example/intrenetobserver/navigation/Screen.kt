package com.example.intrenetobserver.navigation

const val DETAIL_ARGUMENT_ID = "id"

sealed class Screen(val route: String) {
    /*object Home : Screen("home_screen")
    object Detail : Screen("detail_screen/{$DETAIL_ARGUMENT_ID}") {
        fun passId(id: Int): String {
            return "detail_screen/$id"
        }
    }*/
}
