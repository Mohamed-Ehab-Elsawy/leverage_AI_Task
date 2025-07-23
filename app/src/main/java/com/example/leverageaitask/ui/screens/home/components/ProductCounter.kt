package com.example.leverageaitask.ui.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.leverageaitask.R
import com.example.leverageaitask.ui.theme.grey
import com.example.leverageaitask.ui.theme.lightSkyBlue
import com.example.leverageaitask.ui.theme.darkBlue
import com.example.leverageaitask.ui.theme.skyBlue

@Composable
fun ProductCounter(
    modifier: Modifier = Modifier,
    quantity: Int,
    onMinusClick: () -> Unit,
    onPlusClick: () -> Unit
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.elevatedCardColors(containerColor = lightSkyBlue)
    ) {
        Row(
            modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_minus),
                contentDescription = null,
                tint = grey,
                modifier = Modifier.clickable {
                    onMinusClick.invoke()
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(quantity.toString(), color = darkBlue, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                painter = painterResource(R.drawable.ic_add),
                contentDescription = null,
                tint = skyBlue,
                modifier = Modifier.clickable {
                    onPlusClick.invoke()
                }
            )
        }
    }
}