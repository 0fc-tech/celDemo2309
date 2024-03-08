package com.eniecole.mod5navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SignInPage(onClickToHome : ()-> Unit) {
    Scaffold(Modifier.padding(16.dp)) {innerPadding->
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text("Connectez-vous", style = MaterialTheme.typography.headlineMedium)
            TextField(
                modifier=Modifier.fillMaxWidth(),
                value = "Steve Travail",
                onValueChange = {})
            TextField(
                modifier=Modifier.fillMaxWidth(),
                value = "•••••••••",
                onValueChange = {}
            )
            OutlinedButton(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth(),
                onClick = onClickToHome
            ) {
                Text("Se Connecter")
            }
        }
    }
}

