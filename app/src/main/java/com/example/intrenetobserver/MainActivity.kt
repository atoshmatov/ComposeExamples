package com.example.intrenetobserver

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import com.example.intrenetobserver.bottomBar.MainScreen
import com.example.intrenetobserver.datapicker.ExampleScreen
import com.example.intrenetobserver.searchWidget.MainViewModel
import com.example.intrenetobserver.ui.theme.IntrenetObserverTheme


class MainActivity : ComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            IntrenetObserverTheme {
                /*
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
*/
                ExampleScreen()
//                MainScreen()
            }
        }
    }
}