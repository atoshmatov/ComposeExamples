package com.example.intrenetobserver

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    /*Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            modifier = Modifier.clickable {
                navHostController.navigate(route = Screen.Detail.passId(10))
            },
            text = "Home",
            color = MaterialTheme.colors.primary,
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.h3.fontSize
        )
    }*/
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen(
        rememberNavController()
    )
}