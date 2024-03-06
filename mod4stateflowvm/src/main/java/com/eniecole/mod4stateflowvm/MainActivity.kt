package com.eniecole.mod4stateflowvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.eniecole.mod4stateflowvm.ui.theme.DémonstrationsTheme

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
                    RatingScreen()
                }
            }
        }
    }
}

@Composable
fun RatingScreen(ratingViewModel: RatingViewModel = viewModel()) {
    val state by ratingViewModel.ratingState.collectAsState()
    var mutableStateFeedback by remember{ mutableStateOf("") }

    Column {
        Slider(
            value = state.note?.toFloat() ?:5f,
            steps = 10,
            valueRange = 0f..10f,
            onValueChange ={
                ratingViewModel.updateRating(it.toInt())
            }
        )
        if (state is RatingState.RequestFeedback) {
            Text(text = "Qu'est-ce qu'on pourrait faire de mieux la prochaine fois ?")
            TextField(value = mutableStateFeedback, onValueChange = {mutableStateFeedback = it})
        } else if (state is RatingState.Success) {
            Text(text = "Nous sommes contents de voir que cela s’est bien passé")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DémonstrationsTheme {
        RatingScreen()
    }
}