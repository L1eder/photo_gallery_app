package com.example.photogalleryapp

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
fun ButtonBox(currentInd: Int, modifier: Modifier = Modifier, onIndexChange: (Int) -> Unit) {
    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center,
    ){
        Row(
            modifier = modifier
                .fillMaxWidth(),
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
            val newIndex = (currentInd - 1 + 8) % 8
            onIndexChange(newIndex)
        },
        colors = ButtonDefaults.buttonColors(Color(0xFF5481b8)),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .size(150.dp,50.dp)
            .border(1.dp, Color.Black, RoundedCornerShape(16.dp))
            .shadow(4.dp, RoundedCornerShape(16.dp))
    ) {
        Text(
            text = stringResource(id = R.string.previous_button),
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyLarge
        )
    }

    Button(
        onClick = {
            val newIndex = (currentInd + 1) % 8
            onIndexChange(newIndex)
        },
        colors = ButtonDefaults.buttonColors(Color(0xFF5481b8)),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .size(150.dp,50.dp)
            .border(1.dp, Color.Black, RoundedCornerShape(16.dp))
            .shadow(4.dp, RoundedCornerShape(16.dp))
    ) {
        Text(
            text = stringResource(id = R.string.next_button),
            fontSize = 20.sp,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
