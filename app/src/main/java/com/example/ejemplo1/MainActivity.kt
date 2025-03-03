package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ejemplo1.components.ActionButton
import com.example.ejemplo1.navigation.NavManager
import com.example.ejemplo1.ui.theme.Ejemplo1Theme
import com.example.ejemplo1.views.ContentView
import com.example.ejemplo1.views.DetailView
import com.example.ejemplo1.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejemplo1Theme {
                setContent{
                  //GreetingPreview()
                   // DetailView()
                    GreetingPreview()
                    //HomeView()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(){
   //HomeView(navController = )
    NavManager()
    //DetailView()
}