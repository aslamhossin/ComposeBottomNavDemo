package com.github.aslamhossin.bottomnavigationbarsample.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.github.aslamhossin.bottomnavigationbarsample.ui.screens.AccountScreen
import com.github.aslamhossin.bottomnavigationbarsample.ui.screens.CategoriesScreen
import com.github.aslamhossin.bottomnavigationbarsample.ui.screens.HomeScreen
import com.github.aslamhossin.bottomnavigationbarsample.ui.screens.InStoreScreen

@Composable
fun SetupNavHost(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(Screen.Home.route) { HomeScreen() }
        composable(Screen.Categories.route) { CategoriesScreen() }
        composable(Screen.InStore.route) { InStoreScreen() }
        composable(Screen.Account.route) { AccountScreen() }
    }
}
