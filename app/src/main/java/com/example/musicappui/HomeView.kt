package com.example.musicappui

import android.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeView() {

    val categories = listOf(
        "Mobile Development",
        "Web Development",
        "Data Science",
        "Game Development",
        "Cybersecurity"
    )
    val grouped = listOf(
        "Smartphones",
        "Laptops",
        "Smartwatches",
        "Headphones",
        "Smart Home Devices"
    ).groupBy { it -> it[0] }


    LazyColumn {
        grouped.forEach {
            stickyHeader {
                Text(it.value[0], modifier = Modifier.padding(8.dp))
                LazyRow {
                    items(categories) { category ->
                        BrowsItem(cat = category, drawable = R.drawable.ic_subscribe)
                    }
                }
            }
        }
    }
}


@Composable
fun BrowsItem(cat: String, drawable: Int) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(200.dp),
        border = BorderStroke(1.dp, color = androidx.compose.ui.graphics.Color.DarkGray)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = cat)
            Image(painter = painterResource(id = drawable), contentDescription = cat)
        }
    }
}