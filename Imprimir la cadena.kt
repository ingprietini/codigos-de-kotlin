fun main() {
    print("Ingrese una cadena de texto: ")
    val texto = readLine() ?: ""
    val textoConcatenado = texto + " concatenado con Kotlin"

    println("Cadena concatenada: $textoConcatenado")
}
