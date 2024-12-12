package com.example.contadordecliques

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContadorDeCliquesApp()
        }
    }
}

@Composable
fun ContadorDeCliquesApp() {
    var contador by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Contador de Cliques") })
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Cliques: $contador", style = MaterialTheme.typography.h4)

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { contador++ }) {
                Text("Clique Aqui")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = { contador = 0 }) {
                Text("Resetar Contador")
            }
        }
    }
}
