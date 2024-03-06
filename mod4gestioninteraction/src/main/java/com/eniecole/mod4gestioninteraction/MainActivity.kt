package com.eniecole.mod4gestioninteraction

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eniecole.mod4gestioninteraction.ui.theme.DémonstrationsTheme

private const val TAG = "MainActivity"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DémonstrationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Formulaire()
                }
            }
        }
    }
}

@Composable
fun Formulaire() {
    var prenom by rememberSaveable { mutableStateOf("") }
    var nom by rememberSaveable { mutableStateOf("") }
    var dateNaissance by rememberSaveable { mutableStateOf("") }
    Scaffold(contentWindowInsets = WindowInsets(32,32,32,32)){
        innerPadding ->
        Column(
            Modifier
                .fillMaxWidth()
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(8.dp)) {
            TextField(
                value = prenom,
                onValueChange = { prenom = it },
                label = { Text("Prénom") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = nom,
                onValueChange = { nom = it },
                label = { Text("Nom") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = dateNaissance,
                onValueChange = { dateNaissance = it },
                label = { Text("Date de Naissance") },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedButton(

                onClick = {
                    Log.i(TAG, "Formulaire: $prenom $nom $dateNaissance")
            }) {
                Text("Valider")
            }
        }
    }
}
