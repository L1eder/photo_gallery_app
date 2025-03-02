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
            modifier = Modifier.padding(20.dp).border(1.dp, Color.Black),
            contentAlignment = Alignment.Center,
        ) {
            ImageSwitch(currentInd)
        }
    }
}

@Composable
fun ImageSwitch(currentInd: Int) {
    val images = listOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        )
    Image(
        painter = painterResource(id = images[currentInd]),
        contentDescription = "Hz",
        modifier = Modifier
            .border(15.dp, Color.White)
            .shadow(4.dp)
    )
}