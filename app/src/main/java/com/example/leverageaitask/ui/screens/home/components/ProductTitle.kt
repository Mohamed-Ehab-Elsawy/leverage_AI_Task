package com.example.leverageaitask.ui.screens.home.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.example.leverageaitask.ui.theme.darkBlue


@Composable
fun ProductTitle(modifier: Modifier = Modifier, title: String) {
    Text(
        modifier = modifier,
        text = title,
        color = darkBlue,
        fontWeight = FontWeight.Bold,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}