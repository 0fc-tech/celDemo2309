package com.eniecole.mod5activites

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.eniecole.mod5activites.ui.theme.DémonstrationsTheme

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
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Box {
        OutlinedButton(onClick = {
            //Intent explicite (destination connue)
            //context.startActivity(Intent(context, TargetActivity::class.java))
            //Intent implicite (destination inconnue mais on a action et données)
            val geoIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:46.724234,-0.5732"))
            context.startActivity(geoIntent)

        }) {
            Text("Aller vers TargetActivity")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DémonstrationsTheme {
        Greeting("Android")
    }
}