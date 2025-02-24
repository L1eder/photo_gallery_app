package com.example.photogalleryapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DescriptionBox(currentInd: Int, modifier: Modifier = Modifier)
{
    val descriptions = listOf(
        "Bkdkkkdkkk",
        "dsdjjkjkdjskjk"
    )
    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center,
    )
    {
        Box(
            modifier = Modifier.size(300.dp, 100.dp).background(Color.Green)
        ){
            Text(descriptions[currentInd], fontSize = 25.sp)
        }
    }
}