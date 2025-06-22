// MainActivity.kt
package com.example.lab06

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab06.NavRoutes
import com.example.lab06.ui.theme.*
import com.example.lab06.ui.theme.Lab06Theme
import com.example.lab06.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab06Theme {
                val navController = rememberNavController()
                CustomScaffold(navController)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomScaffold(navController: NavController) { // Recibe el NavController
    Scaffold(

        topBar = { CustomTopBar(navController) }, // Pasa el NavController

        bottomBar = { CustomBottomBar(navController) }, // Pasa el NavController

        floatingActionButton = { CustomFAB() },

        content = { padding ->

            NavHost(
                navController = navController as NavHostController,
                startDestination = NavRoutes.HOME,
                modifier = Modifier.padding(padding)
            ) {
                composable(NavRoutes.HOME) { HomeScreen(padding) }
                composable(NavRoutes.PROFILE) { ProfileScreen(padding) }
                composable(NavRoutes.BUILD) { BuildScreen(padding) }
                composable(NavRoutes.MENU) { MenuScreen(padding) }
                composable(NavRoutes.FAVORITE) { FavoriteScreen(padding) }
                composable(NavRoutes.DELETE) { DeleteScreen(padding) }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /* TODO: abre menú lateral*/ }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = "Menu")
            }
        },
        title = { Text(text = "Sample Title") },
        actions = {
            IconButton(onClick = { /* TODO: función buscar */ }) {
                Icon(imageVector = Icons.Rounded.Search, contentDescription = "Search")
            }
            IconButton(onClick = { navController.navigate(NavRoutes.PROFILE) }) {
                Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "Profile")
            }
        }
    )
}

@Composable
fun CustomBottomBar(navController: NavController) {
    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = { navController.navigate(NavRoutes.BUILD) }) { // Navega a Build
                Icon(painter = painterResource(id = R.drawable.eyfzxq7ni8b71), contentDescription = "Build")
            }
            IconButton(onClick = { navController.navigate(NavRoutes.MENU) }) { // Navega a Menu
                Icon(Icons.Filled.Menu, contentDescription = "Menu")
            }
            IconButton(onClick = { navController.navigate(NavRoutes.FAVORITE) }) { // Navega a Favorite
                Icon(Icons.Filled.Favorite, contentDescription = "Favorite")
            }
            IconButton(onClick = { navController.navigate(NavRoutes.DELETE) }) { // Navega a Delete
                Icon(Icons.Filled.Delete, contentDescription = "Delete")
            }
        }
    }
}


@Composable
fun CustomFAB() {
    var contar by remember{ mutableStateOf(0) }
    FloatingActionButton(
        onClick = { contar++ }
    ) {
        Text(
            fontSize = 24.sp,
            text = "$contar"
        )
    }
}






