package br.zc.investe.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.zc.investe.ui.login.LoginScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            LoginScreen()
        }
        composable(route = BottomBarScreen.Report.route) {
            LoginScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            LoginScreen()
        }
    }
}