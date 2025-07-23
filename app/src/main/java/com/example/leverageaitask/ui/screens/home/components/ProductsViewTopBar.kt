package com.example.leverageaitask.ui.screens.home.components

import android.app.Activity
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.leverageaitask.ui.theme.darkBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductsViewTopBar(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val activity = context as? Activity

    TopAppBar(
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFFF3F8FC)
        ),
        navigationIcon = {
            IconButton(onClick = {
                activity?.finish()
            }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                    contentDescription = "search_icon",
                    tint = darkBlue
                )
            }
        },
        title = {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "التصنيفات",
                fontSize = 20.sp,
                color = darkBlue,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        },
        actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Search icon pressed", Toast.LENGTH_SHORT).show()
            }) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = "search_icon",
                    tint = darkBlue
                )
            }
        }
    )
}