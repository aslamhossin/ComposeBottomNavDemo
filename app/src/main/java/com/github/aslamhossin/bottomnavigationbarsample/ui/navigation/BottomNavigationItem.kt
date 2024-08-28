package com.github.aslamhossin.bottomnavigationbarsample.ui.navigation

import com.github.aslamhossin.bottomnavigationbarsample.R

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val hasNews: Boolean,
    val badgeCount: Int? = null,
)


val bottomNavigationItems = listOf(
    BottomNavigationItem(
        title = "Home",
        selectedIcon = R.drawable.ic_filled_home,
        unselectedIcon = R.drawable.ic_outline_home,
        hasNews = false,
    ),
    BottomNavigationItem(
        title = "Categories",
        selectedIcon = R.drawable.ic_filled_category,
        unselectedIcon = R.drawable.ic_outline_category,
        hasNews = false,
        badgeCount = 45
    ),
    BottomNavigationItem(
        title = "In-Store",
        selectedIcon = R.drawable.ic_filler_store,
        unselectedIcon = R.drawable.ic_outline_store,
        hasNews = true,
    ),
    BottomNavigationItem(
        title = "Account",
        selectedIcon = R.drawable.ic_filled_account,
        unselectedIcon = R.drawable.ic_outline_account,
        hasNews = true,
    ),
)
