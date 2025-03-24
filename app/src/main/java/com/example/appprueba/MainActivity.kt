package com.example.appprueba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appprueba.ui.theme.AppPruebaTheme

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width

// MainActivity es la clase principal de nuestra aplicación
class MainActivity : ComponentActivity() {

    // onCreate es el método que se ejecuta al iniciar la aplicación
    override fun onCreate(savedInstanceState: Bundle?) {

        // super.onCreate(savedInstanceState) es el método que se ejecuta al iniciar la aplicación
        super.onCreate(savedInstanceState)

        // enableEdgeToEdge es el método que nos permite habilitar el modo de pantalla completa
        enableEdgeToEdge()

        // setContent es el método que nos permite definir el contenido de la aplicación
        setContent {

            // Modifier es un objeto que nos permite definir las propiedades de un componente
            MiPrimerComposable()
        }
    }
}


// Preview es una vista previa de nuestro composable
@Composable

// MiPrimerComposable es un composable que nos permite mostrar un texto
fun MiPrimerComposable() {

    // Scaffold es un contenedor que nos permite tener un AppBar y un Body
    Column(modifier = Modifier.fillMaxSize().padding(top=35.dp)) {

        // Row es un contenedor que nos permite tener elementos en una fila
        Row {

            // Text es un componente que nos permite mostrar texto
            Text(text="Texto fila 1")

            // Spacer es un componente que nos permite agregar espacio
            Spacer(modifier = Modifier.width(35.dp))

            // Text es un componente que nos permite mostrar texto
            Text(text="Texto fila 1B")

        }

        // Spacer es un componente que nos permite agregar espacio
        Spacer(modifier = Modifier.height(35.dp))

        // Text es un componente que nos permite mostrar texto
        Text(text="Hola alumnos de kotlin")

        // Spacer es un componente que nos permite agregar espacio
        Text(text="Este es nuestro primer compostable")

    }
}
