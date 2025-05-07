package com.example.musicappui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BrowsView() {
    val bookCategories = listOf(
        "Fiction",
        "Non-Fiction",
        "Science Fiction",
        "Fantasy",
        "Mystery"
    )
    val foodCategories = listOf(
        "Italian",
        "Mexican",
        "Chinese",
        "Indian",
        "Japanese"
    ).groupBy { item -> item[0] }

    LazyVerticalGrid(
        modifier = Modifier
            .padding(8.dp),
        columns = GridCells.Fixed(2)
    ) {
        items(bookCategories) { bookCat ->
            BrowsCard(category = bookCat, drawable = R.drawable.ic_subscribe)
        }
    }

}


@Composable
fun BrowsCard(category: String, drawable: Int) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(200.dp),
        border = BorderStroke(1.dp, color = Color.DarkGray)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(8.dp).fillMaxSize()
        ) {
            Text(text = category)
            Image(painter = painterResource(id = drawable), contentDescription = category)
        }
    }
}