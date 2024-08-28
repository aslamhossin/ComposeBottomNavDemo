package com.github.aslamhossin.bottomnavigationbarsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.github.aslamhossin.bottomnavigationbarsample.ui.navigation.BottomNavigationBar
import com.github.aslamhossin.bottomnavigationbarsample.ui.navigation.Screen
import com.github.aslamhossin.bottomnavigationbarsample.ui.navigation.SetupNavHost
import com.github.aslamhossin.bottomnavigationbarsample.ui.navigation.bottomNavigationItems
import com.github.aslamhossin.bottomnavigationbarsample.ui.theme.BottomNavigationBarSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BottomNavigationBarSampleTheme {
                var selectedItemIndex by rememberSaveable { mutableStateOf(0) }
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                items = bottomNavigationItems,
                                selectedItemIndex = selectedItemIndex,
                                onItemSelected = { index ->
                                    selectedItemIndex = index
                                    when (index) {
                                        0 -> navController.navigate(Screen.Home.route)
                                        1 -> navController.navigate(Screen.Categories.route)
                                        2 -> navController.navigate(Screen.InStore.route)
                                        3 -> navController.navigate(Screen.Account.route)
                                    }
                                }
                            )
                        }
                    ) { SetupNavHost(navController, it) }
                }
            }
        }
    }

}
