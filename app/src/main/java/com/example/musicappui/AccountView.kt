package com.example.musicappui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Column {
                    Text("Android Developer")
                    Text("Ios Developer")
                }
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null
                )
            }
        }
        Row(modifier = Modifier.padding(top = 16.dp)) {
            Icon(
                painter = painterResource(R.drawable.music_player),
                contentDescription = "My Music",
                modifier = Modifier.padding(end = 8.dp)
            )
            Text("My Music")
        }
        Divider()
    }
}