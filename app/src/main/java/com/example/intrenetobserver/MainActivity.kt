package com.example.intrenetobserver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.intrenetobserver.searchWidget.MainSearchScreen
import com.example.intrenetobserver.searchWidget.MainViewModel
import com.example.intrenetobserver.ui.theme.IntrenetObserverTheme


class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            IntrenetObserverTheme {
                MainSearchScreen(mainViewModel = viewModel)
            }
        }
    }
}