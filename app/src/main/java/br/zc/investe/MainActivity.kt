package br.zc.investe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import br.zc.investe.navegation.BottomBar
import br.zc.investe.navegation.BottomNavGraph
import br.zc.feature_main.login.GoogleAuthUiClient
import br.zc.uikit.components.theme.InvesteTheme
import com.google.android.gms.auth.api.identity.Identity

class MainActivity : ComponentActivity() {

    private val googleAuthUiClient by lazy {
        GoogleAuthUiClient(
            context = applicationContext,
            oneTapClient = Identity.getSignInClient(applicationContext)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            InvesteTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = {
                        val currentRoute = currentRoute(navController)
                        if (currentRoute != "login") {
                            BottomBar(navController = navController)
                        }
                    }
                ) {
                    Modifier.padding(it)
                    BottomNavGraph(
                        navController = navController,
                        googleAuthUiClient = googleAuthUiClient,
                        lifecycleScope = lifecycleScope
                    )
                }
            }
        }
    }
}

@Composable
fun currentRoute(navController: NavController): String? {
    val backStackEntry = navController.currentBackStackEntryAsState()
    return backStackEntry.value?.destination?.route
}