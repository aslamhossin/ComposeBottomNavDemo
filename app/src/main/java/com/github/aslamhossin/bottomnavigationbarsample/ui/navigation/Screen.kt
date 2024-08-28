package com.github.aslamhossin.bottomnavigationbarsample.ui.navigation

sealed class Screen(val route: String) {
    data object Home : Screen("home")
    data object Categories : Screen("categories")
    data object InStore : Screen("in_store")
    data object Account : Screen("account")
}

