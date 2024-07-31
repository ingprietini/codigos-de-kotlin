fun main() {
    print("Ingrese un número entero: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    println("Número ingresado: $numero")
    println("Cuadrado del número: ${numero * numero}")
}
