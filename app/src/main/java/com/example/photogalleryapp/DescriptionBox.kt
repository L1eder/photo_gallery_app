package com.example.photogalleryapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
        Pair(stringResource(id = R.string.photo_description_1),
        stringResource(id = R.string.photo_description_1_2)),
        Pair(stringResource(id = R.string.photo_description_2),
            stringResource(id = R.string.photo_description_2_2)),
        Pair(stringResource(id = R.string.photo_description_3),
            stringResource(id = R.string.photo_description_3_2)),
        Pair(stringResource(id = R.string.photo_description_4),
            stringResource(id = R.string.photo_description_4_2)),
        Pair(stringResource(id = R.string.photo_description_5),
            stringResource(id = R.string.photo_description_5_2)),
        Pair(stringResource(id = R.string.photo_description_6),
            stringResource(id = R.string.photo_description_6_2)),
        Pair(stringResource(id = R.string.photo_description_7),
            stringResource(id = R.string.photo_description_7_2)),
        Pair(stringResource(id = R.string.photo_description_8),
            stringResource(id = R.string.photo_description_8_2)),
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
                .border(1.dp, Color.Black, shape = RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center,
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ){
                Text(descriptions[currentInd].first, fontSize = 25.sp)
                Text(descriptions[currentInd].second, fontSize = 18.sp)
            }
        }
    }
}