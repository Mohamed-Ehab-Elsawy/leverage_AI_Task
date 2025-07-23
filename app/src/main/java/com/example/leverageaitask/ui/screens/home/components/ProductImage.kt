package com.example.leverageaitask.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.leverageaitask.R

@Composable
fun ProductImage(modifier: Modifier = Modifier, imageUrl: String) {
    AsyncImage(
        model = imageUrl,
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .defaultMinSize(minHeight = 180.dp)
            .padding(horizontal = 8.dp),
        contentScale = ContentScale.FillBounds,
        error = painterResource(id = R.drawable.img_product_test)
    )
}