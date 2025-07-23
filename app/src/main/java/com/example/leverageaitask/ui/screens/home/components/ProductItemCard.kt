package com.example.leverageaitask.ui.screens.home.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.leverageaitask.data.model.Product

@Composable
fun ProductItemCard(
    modifier: Modifier = Modifier,
    product: Product
) {
    var quantity by remember { mutableIntStateOf(0) }
    val context = LocalContext.current
    Card(
        modifier = modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .wrapContentHeight()
            .clickable {
                Toast.makeText(context, "Product: ${product.foodName} clicked", Toast.LENGTH_SHORT)
                    .show()
            },
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.elevatedCardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(horizontal = 8.dp)) {
            ProductImage(imageUrl = product.urlImage)
            ProductTitle(title = product.foodName)
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                ProductPrice(price = product.price)
                Spacer(modifier = Modifier.width(4.dp))
                ProductCounter(
                    quantity = quantity,
                    onMinusClick = {
                        if (quantity > 0)
                            quantity--
                    },
                    onPlusClick = {
                        quantity++
                    }
                )
            }
        }
    }
}