package com.starglen.zawadimart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_HOME
import com.navigation.ROUT_ABOUT
import com.navigation.ROUT_INTENT
import com.navigation.ROUT_ITEM
import com.navigation.ROUT_START
import com.starglen.zawadimart.ui.screens.about.AboutScreen
import com.starglen.zawadimart.ui.screens.home.HomeScreen
import com.starglen.zawadimart.ui.screens.intent.IntentScreen
import com.starglen.zawadimart.ui.screens.items.ItemsScreen
import com.starglen.zawadimart.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemsScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }

    }
}