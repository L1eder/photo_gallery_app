package com.example.photogalleryapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBox(currentInd: Int, modifier: Modifier = Modifier, onIndexChange: (Int) -> Unit) {
    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ){
        Row(
            modifier = modifier
                .fillMaxWidth(),
            //.background(Color.Blue),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            ButtonEvent(currentInd, onIndexChange)
        }
    }

}

@Composable
fun ButtonEvent(currentInd: Int, onIndexChange: (Int) -> Unit) {
    Button(
        onClick = {
            val newIndex = (currentInd - 1 + 2) % 2
            onIndexChange(newIndex)
        }
    ) {
        Text("Previous", fontSize = 25.sp)
    }

    Button(
        onClick = {
            val newIndex = (currentInd + 1) % 2
            onIndexChange(newIndex)
        }
    ) {
        Text("Next", fontSize = 25.sp)
    }
}
