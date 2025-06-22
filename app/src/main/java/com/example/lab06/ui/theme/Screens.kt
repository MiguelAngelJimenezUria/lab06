package com.example.lab06.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab06.ui.theme.Lab06Theme // Asegúrate de importar tu tema

/**
 * Pantalla de inicio de la aplicación.
 */
@Composable
fun HomeScreen(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Bienvenido a la Pantalla de Inicio",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = "Explora las funcionalidades de tu app.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

/**
 * Pantalla de perfil del usuario.
 */
@Composable
fun ProfileScreen(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "¡Hola desde la Pantalla de Perfil!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.secondary
        )
        Text(
            text = "Aquí podrás ver y editar tu información.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

/**
 * Pantalla para funcionalidades de "build" o construcción.
 */
@Composable
fun BuildScreen(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sección de Construcción (Build)",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.tertiary
        )
        Text(
            text = "Aquí irán las herramientas de desarrollo.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

/**
 * Pantalla que representa un menú general.
 */
@Composable
fun MenuScreen(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Explora el Menú Principal",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primaryContainer
        )
        Text(
            text = "Accede a todas las opciones de la aplicación.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

/**
 * Pantalla para ítems favoritos.
 */
@Composable
fun FavoriteScreen(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tus Favoritos",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
        Text(
            text = "Aquí guardas lo que más te gusta.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

/**
 * Pantalla para la funcionalidad de eliminar.
 */
@Composable
fun DeleteScreen(padding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sección de Eliminación (Delete)",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.error
        )
        Text(
            text = "Cuidado con lo que eliminas aquí.",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

// Opcional: Vistas previas para cada pantalla
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Lab06Theme {
        HomeScreen(padding = PaddingValues(0.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    Lab06Theme {
        ProfileScreen(padding = PaddingValues(0.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BuildScreenPreview() {
    Lab06Theme {
        BuildScreen(padding = PaddingValues(0.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun MenuScreenPreview() {
    Lab06Theme {
        MenuScreen(padding = PaddingValues(0.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteScreenPreview() {
    Lab06Theme {
        FavoriteScreen(padding = PaddingValues(0.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DeleteScreenPreview() {
    Lab06Theme {
        DeleteScreen(padding = PaddingValues(0.dp))
    }
}