package com.example.photogalleryapp

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NameBox(modifier: Modifier = Modifier)
{
    Box(
        modifier = modifier,
        contentAlignment = Alignment.BottomCenter,
    ) {
        Text(
            text = "PHOTO GALLERY",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}