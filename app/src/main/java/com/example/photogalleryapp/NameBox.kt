package com.example.photogalleryapp

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun NameBox(modifier: Modifier = Modifier)
{
    Box(
        modifier = modifier,
        contentAlignment = Alignment.BottomCenter,
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}