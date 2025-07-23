package com.example.leverageaitask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.leverageaitask.ui.screens.home.ProductsView
import com.example.leverageaitask.ui.theme.LeverageAITaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LeverageAITaskTheme {
                ProductsView()
            }
        }
    }
}