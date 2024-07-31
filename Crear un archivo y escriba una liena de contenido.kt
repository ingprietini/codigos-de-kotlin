import java.io.File

fun main() {
    val nombreArchivo = "archivo.txt"
    val contenido = "Esta es una línea de contenido."
    File(nombreArchivo).writeText(contenido)
}
