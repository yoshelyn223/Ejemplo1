package com.example.ejemplo1.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.ejemplo1.components.MainButton
import com.example.ejemplo1.components.TitleBar
import com.example.ejemplo1.components.TitleView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("DETAIL VIEW") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Blue)
            )
        }
    ){
        ContentView2()
    }
}

@Composable
fun ContentView2(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       TitleView("Home")
        MainButton("Generico", Color.Red, Color.Black) {
            Log.d("ya", "Soy un boton generico")
        }
    }
}