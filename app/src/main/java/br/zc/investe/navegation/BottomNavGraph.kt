package br.zc.investe.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
//            LoginScreen(state)
        }
        composable(route = BottomBarScreen.Report.route) {
//            LoginScreen(state)
        }
        composable(route = BottomBarScreen.Profile.route) {
//            LoginScreen(state)
        }
    }
}