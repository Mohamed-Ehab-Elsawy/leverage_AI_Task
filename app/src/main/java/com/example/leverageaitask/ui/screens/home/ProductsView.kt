package com.example.leverageaitask.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.leverageaitask.ui.screens.home.components.CategoriesTabs
import com.example.leverageaitask.ui.screens.home.components.FloatingBottomCartBar
import com.example.leverageaitask.ui.screens.home.components.ProductsList
import com.example.leverageaitask.ui.screens.home.components.ProductsViewTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsView() {

    Scaffold(
        topBar = {
            ProductsViewTopBar()
        },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .background(Color.White)
            ) {
                CategoriesTabs()
                ProductsList()
                Spacer(modifier = Modifier.height(100.dp))
            }

            FloatingBottomCartBar(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            )
        }
    }
}