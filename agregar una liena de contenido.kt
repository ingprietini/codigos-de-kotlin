import java.io.File

fun main() {
    val nombreArchivo = "archivo.txt"
    val nuevaLinea = "Esta es una nueva línea de contenido."
    File(nombreArchivo).appendText("\n$nuevaLinea")
}
