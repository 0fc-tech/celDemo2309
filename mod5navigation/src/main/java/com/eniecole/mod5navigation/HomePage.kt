package com.eniecole.mod5navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomePage() {
    Text(modifier = Modifier.padding(16.dp),
        text = "Bienvenue sur votre espace"
    )
}
