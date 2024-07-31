fun main() {
    print("Ingrese un número entero: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero % 2 == 0) {
        println("El número $numero es par.")
    } else {
        println("El número $numero es impar.")
    }
}
