import java.io.File

fun main() {
    val nombreArchivo = "archivo.txt"
    val contenidoLeido = File(nombreArchivo).readText()
    println("Contenido del archivo: $contenidoLeido")
}
