package com.example.leverageaitask.ui.screens.home.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.leverageaitask.viewmodel.ProductsViewModel

@Composable
fun ProductsList(
    modifier: Modifier = Modifier,
    viewModel: ProductsViewModel = viewModel()
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), modifier = modifier.padding(top = 16.dp),
    ) {
        items(viewModel.products.value?.size!!) { index ->
            ProductItemCard(
                product = viewModel.products.value?.get(index)!!,
            )
        }
    }
}