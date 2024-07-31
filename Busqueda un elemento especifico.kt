fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val buscarNumero = 3
    val posicion = numeros.indexOf(buscarNumero)
    if (posicion >= 0) {
        println("El número $buscarNumero se encuentra en la posición $posicion.")
    } else {
        println("El número $buscarNumero no se encuentra en el arreglo.")
    }
}
