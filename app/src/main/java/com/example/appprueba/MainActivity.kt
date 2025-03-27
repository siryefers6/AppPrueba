package com.example.appprueba
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.sp


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
@Preview
@Composable
fun MiSegundoComposable() {

    // Declaramos el color de fondo de la interfaz
    var colorFondo by remember { mutableStateOf( Color.White )}

    var posicionTexto by remember { mutableStateOf(Offset(0f,0f))}

    // Box es un contenedor que nos permite tener elementos en una caja
    Box(modifier = Modifier.fillMaxSize().padding(35.dp).background(colorFondo)) {

        // Image es un componente que nos permite mostrar una imagen
        Image(
            painter = painterResource(id = R.drawable.hammer), // painterResource nos permite cargar una imagen
            contentDescription = "Hammer",
            modifier = Modifier.align(Alignment.Center).fillMaxSize() // fillMaxSize nos permite ocupar todo el espacio disponible
        )

        // Text es un componente que nos permite mostrar texto
        Text(
            text="Hammer Moster Hunter",
            fontSize = 24.sp,
            color=Color.Yellow,
            textAlign = TextAlign.Center,
            // modifier = Modifier.align(Alignment.Center)
            modifier = Modifier
                .offset{
                    IntOffset(posicionTexto.x.toInt(), posicionTexto.y.toInt())
                }
                .pointerInput(Unit) {
                    detectDragGestures { change, dragAmount ->
                        change.consume()
                        posicionTexto+=Offset(dragAmount.x, dragAmount.y)
                    }
                }
        )

        // Botón en la parte superior izquierda
        Button(
            // Para color aleatorio rgb
            // onClick = { colorFondo = colorAleatorio() },
            // Para color aleatorio hexadecimal
            onClick = { colorFondo = Color(colorAleatorio()) },
            modifier = Modifier.align(Alignment.TopStart)
        ) {
            Text(text="Fondo")
        }

    }

}

// Función para cambiar colores con rgb
/*fun colorAleatorio(): Color {
    val rojo = (0..255).random()
    val verde = (0..255).random()
    val azul = (0..255).random()

    return Color(red=rojo, green=verde, blue=azul)
}*/

// Función para cambiar colores con hexadecimal
fun colorAleatorio(): Long {
    return (0xFFFFFF..0xFFFFFFFF).random()
}
