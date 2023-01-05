package com.example.intrenetobserver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Slider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.intrenetobserver.motionLyout.ProfileHeader
import com.example.intrenetobserver.searchWidget.MainViewModel
import com.example.intrenetobserver.ui.theme.IntrenetObserverTheme


class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            IntrenetObserverTheme {
                Column {
                    var process by remember {
                        mutableStateOf(0f)
                    }
                    ProfileHeader(progress = process)
                    Spacer(modifier = Modifier.height(32.dp))
                    Slider(
                        value = process,
                        onValueChange = {
                            process = it
                        },
                        modifier = Modifier.padding(horizontal = 32.dp)
                    )
                }
                
            }
        }
    }
}