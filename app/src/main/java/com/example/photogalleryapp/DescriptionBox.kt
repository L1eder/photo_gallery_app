package com.example.photogalleryapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DescriptionBox(currentInd: Int, modifier: Modifier = Modifier)
{
    val descriptions = listOf(
         stringResource(id = R.string.photo_description_1),
        "dsdjjkjkdjskjk",
        stringResource(id = R.string.photo_description_1),
        "dsdjjkjkdjskjk",
        stringResource(id = R.string.photo_description_1),
        "dsdjjkjkdjskjk",
        stringResource(id = R.string.photo_description_1),
        "dsdjjkjkdjskjk",
    )
    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center,
    )
    {
        Box(
            modifier = Modifier
                .size(300.dp, 100.dp)
                .shadow(4.dp, RoundedCornerShape(16.dp))
                .background(Color.White, RoundedCornerShape(16.dp))
                .border(0.5.dp, Color.Black, shape = RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center,
        ){
            Text(descriptions[currentInd], fontSize = 25.sp)
        }
    }
}