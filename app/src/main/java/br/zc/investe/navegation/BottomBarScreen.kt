package br.zc.investe.navegation

import br.zc.uikit.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    // for home
    object Login: BottomBarScreen(
        route = "login",
        title = "Login",
        icon = R.drawable.icon_home,
        icon_focused = R.drawable.icon_home
    )

    // for report
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.icon_home,
        icon_focused = R.drawable.icon_home
    )

    // for report
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.icon_profile,
        icon_focused = R.drawable.icon_profile
    )

}