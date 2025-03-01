package com.example.photogalleryapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable

fun MainScreen(){
    var currentInd by rememberSaveable { mutableIntStateOf(0) }
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        BackgroundImage()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        )
        {
            ImageBox(currentInd, modifier = Modifier.weight(6f))
            DescriptionBox(currentInd, modifier = Modifier.weight(2f))
            ButtonBox(currentInd, modifier = Modifier.weight(1f)) { newIndex ->
                currentInd = newIndex
            }
        }
    }
}
