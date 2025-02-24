package com.example.photogalleryapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ImageBox(currentInd: Int, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            contentAlignment = Alignment.Center,
        ) {
            ImageSwitch(currentInd)
        }
    }
}

@Composable
fun ImageSwitch(currentInd: Int) {
    val images = listOf(
        R.drawable.test_img,
        R.drawable.test_img2,
    )
    Image(
        painter = painterResource(id = images[currentInd]),
        contentDescription = "Hz",
        modifier = Modifier
            .border(10.dp, Color.White)
            .shadow(4.dp)
    )
}