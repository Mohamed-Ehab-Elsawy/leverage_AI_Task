package com.example.leverageaitask.ui.screens.home.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.example.leverageaitask.ui.theme.skyBlue

@Composable
fun ProductPrice(modifier: Modifier = Modifier, price: Double) {
    Text(
        modifier = modifier,
        text = "$price SAD",
        color = skyBlue,
        fontWeight = FontWeight.Bold,
        overflow = TextOverflow.Ellipsis,
        maxLines = 1
    )
}