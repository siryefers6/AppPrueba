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
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment


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

            //MiPrimerComposable()
            MiSegundoComposable()

        }
    }
}


// Preview es una vista previa de nuestro composable
// MiPrimerComposable es un composable que nos permite mostrar un texto
@Composable
fun MiPrimerComposable() {

    // Column es un contenedor que nos permite tener elementos en una columna
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


// MiSegundoComposable es un composable que nos permite mostrar un texto
@Composable
fun MiSegundoComposable() {

    // Box es un contenedor que nos permite tener elementos en una caja
    Box(modifier = Modifier.fillMaxSize().padding(20.dp)) {

        // Texto que se alinea en la parte superior izquierda
        Text(text = "Hola arriba izquierda", modifier = Modifier.align(Alignment.TopStart))

        // Texto que se alinea en el centro
        Text(text = "Hola centrado", modifier = Modifier.align(Alignment.Center))

        // Texto que se alinea en la parte inferior derecha
        Text(text = "Hola abajo derecha", modifier = Modifier.align(Alignment.BottomEnd))

    }

}



