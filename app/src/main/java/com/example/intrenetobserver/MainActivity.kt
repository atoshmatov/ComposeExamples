package com.example.intrenetobserver

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.intrenetobserver.searchWidget.MainViewModel
import com.example.intrenetobserver.shimmerEffect.ShimmerListItem
import com.example.intrenetobserver.ui.theme.IntrenetObserverTheme
import kotlinx.coroutines.delay

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

                var isLoading by remember {
                    mutableStateOf(true)
                }

                LaunchedEffect(key1 = true) {
                    delay(10000)
                    isLoading = false
                }
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    items(20) {
                        ShimmerListItem(
                            isLoading = isLoading,
                            contentAfterLoading = {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Home,
                                        contentDescription = null,
                                        modifier = Modifier.size(100.dp),
                                    )
                                    Spacer(modifier = Modifier.width(16.dp))
                                    Text(
                                        text = "This is a long text to show that our shimmer display " +
                                                "is looking perfectly fine",
                                    )
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                        )
                    }
                }
            }
        }
    }
}
