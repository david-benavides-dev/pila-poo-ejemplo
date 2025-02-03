import classes.*

fun main() {
    val pila = Pila("Numeros enteros", 1, 0 , 5, 77, 89)

    val pila2 = Pila("Cajon de sastre", elementos = listOf("123", null, "hola", 10.0, 'c', 44), patron = "^[a-z]+$")

    println(pila)
    println(pila2)
}