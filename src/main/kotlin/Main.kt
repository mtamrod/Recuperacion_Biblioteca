package org.pebiblioteca

fun main() {
    println("Hello World!")
}

fun UserMenu() {
    do {
        println("MENU:")
        println("1. Agregar Libro")
        println("2. Eliminar Libro")
        println("3. Registrar Préstamo")
        println("4. Devolver Libro")
        println("5. Disponibilidad Libro")
        println("6. Mostrar Libros")
        println("7. Salir")
        print("Ingrese su opción: ")

        val opcion = readln().toIntOrNull()

        when (opcion) {
            1 ->
            2 ->
            3 ->
            4 ->
            5 ->
            6 ->
            else -> println("Opción no válida")
        }
    } while (opcion != 7)
}