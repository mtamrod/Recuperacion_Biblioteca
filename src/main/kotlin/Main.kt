package org.pebiblioteca

fun main() {
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
            1 -> GestorBiblioteca.agregarLibro(titulo, autor)
            2 -> eliminarLibro()
            3 -> registrarPrestamo()
            4 -> devolverLibro()
            5 -> disponibilidadLibro()
            6 -> retornarLibro()
            else -> println("Opción no válida")
        }
    } while (opcion != 7)
}


