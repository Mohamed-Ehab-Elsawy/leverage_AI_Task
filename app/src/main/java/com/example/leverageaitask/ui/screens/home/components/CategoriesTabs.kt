package com.example.leverageaitask.ui.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.leverageaitask.ui.theme.lightGrey
import com.example.leverageaitask.ui.theme.lightSkyBlue
import com.example.leverageaitask.ui.theme.darkBlue
import com.example.leverageaitask.ui.theme.skyBlue

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CategoriesTabs(modifier: Modifier = Modifier) {
    val categoriesList = listOf("أفضل عروض", "مستورد", "أجبان قابلة للدهن", "أجبان")
    var selectedIndex by remember { mutableIntStateOf(0) }
    FlowRow(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        categoriesList.forEachIndexed { index, label ->
            FilterChip(
                colors = FilterChipDefaults.filterChipColors(
                    containerColor = lightGrey,
                    labelColor = darkBlue,
                    selectedContainerColor = lightSkyBlue,
                    selectedLeadingIconColor = darkBlue,
                    selectedLabelColor = skyBlue,
                ),
                shape = RoundedCornerShape(16.dp),
                border = FilterChipDefaults.filterChipBorder(
                    enabled = false,
                    selected = false,
                    borderWidth = 0.dp
                ),
                selected = selectedIndex == index,
                onClick = { selectedIndex = index },
                label = {
                    Text(
                        text = label,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                },
                leadingIcon = if (selectedIndex == index) {
                    {
                        Icon(
                            imageVector = Icons.Rounded.Check,
                            contentDescription = "Selected",
                            modifier = Modifier.size(18.dp)
                        )
                    }
                } else null,
                modifier = Modifier
                    .wrapContentHeight(),
            )
        }
    }
}