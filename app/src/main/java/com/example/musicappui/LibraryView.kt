package com.example.musicappui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun LibraryView() {
    LazyColumn {
        items(liblist) { item: Lib ->
            LibItem(lib = item)
        }
    }
}


@Composable
fun LibItem(lib: Lib) {
    Column {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(painter = painterResource(id = lib.icon), contentDescription = lib.name)
                Text(text = lib.name, modifier = Modifier.padding(start = 8.dp))
            }
            IconButton(onClick = {},
                content = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = ""
                    )
                })
            Divider(color = androidx.compose.ui.graphics.Color.LightGray, thickness = 1.dp)
        }
    }
}