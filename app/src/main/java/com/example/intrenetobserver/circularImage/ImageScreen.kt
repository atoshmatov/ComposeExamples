package com.example.intrenetobserver.circularImage

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.intrenetobserver.R

@Composable
fun ImageScreen() {

    Image(
        modifier = Modifier
            .clip(CircleShape)
            .size(300.dp)
            .border(
                width = 4.dp,
                color = Color.Gray,
                shape = CircleShape
            ),
        painter = painterResource(id = R.drawable.img),
        contentDescription = "Circular Image"
    )
}

@Preview
@Composable
fun ImagePrev() {
    ImageScreen()
}