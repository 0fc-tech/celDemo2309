package com.eniecole.mod5navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.eniecole.mod5navigation.ui.theme.DémonstrationsTheme

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
                    HostMod5Nav()
                }
            }
        }
    }
}
@Composable
fun HostMod5Nav(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "signin"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("signin") {
            SignInPage(onClickToHome = {navController.navigate("home")})
        }
        composable("home"){
            HomePage()
        }
        composable("profile/{userId}&{profileName}",
            arguments = listOf(
                navArgument("userId"){type= NavType.StringType},
                navArgument("profileName"){type= NavType.StringType},
            ))
        { backStackEntry->
            ProfilePage(backStackEntry.arguments?.getString("userId"))

        }
    }
}

@Composable
fun ProfilePage(userId:String?) {
    TODO("Not yet implemented")
}
