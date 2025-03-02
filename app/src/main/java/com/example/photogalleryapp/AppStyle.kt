package com.example.photogalleryapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun BackgroundImage()
{
    Image(
        painter =  painterResource(R.drawable.background),
        contentDescription = stringResource(id = R.string.background_image_description),
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}