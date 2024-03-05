package com.eniecole.mod3compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import com.eniecole.mod3compose.ui.theme.DémonstrationsTheme

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
                    PageScaffold()
                }
            }
        }
    }
}

@Composable
fun PageScaffold(): Unit {
    Scaffold() {innerPadding->
        Greeting(name = "HelloWorld",modifier = Modifier.padding(innerPadding))
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Hello $name!",
            color = Color.Green,
            modifier = modifier
        )
        Text("Hello World")
        Text("Hello World2")
        Text("Hello World3")
        Text("Hello World4")

    }
}


@Preview(showBackground = true)
@Composable
fun PageScaffoldPreview() {
    PageScaffold()
}