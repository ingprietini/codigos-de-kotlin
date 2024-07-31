fun main() {
    val enteroA = 8
    val enteroB = 3
    val flotanteA = 7.5f
    val flotanteB = 2.5f

    val comparacion = (enteroA > enteroB) && (flotanteA != flotanteB)
    val logico = (enteroA < enteroB) || (flotanteA == flotanteB)
    val negacion = !(enteroA == enteroB)

    println("Comparación (enteroA > enteroB && flotanteA != flotanteB): $comparacion")
    println("Lógico (enteroA < enteroB || flotanteA == flotanteB): $logico")
    println("Negación !(enteroA == enteroB): $negacion")
}
