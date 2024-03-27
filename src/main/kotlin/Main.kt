package org.pebiblioteca

fun main() {
    val librito1 = Libro(0, "Mein Kampf", "Adolf Hitler", 1925, "Autobiografia")
    val librito2 = Libro(1, "La Doctrina del Fascismo", "Benito Mussolini", 1932, "SocioPolitica", Estado.PRESTADO)
    val librito3 = Libro(2,  "La España heroica", "Francisco Franco", 1938, "Guerra")

    val gestorbiblioteca = GestorBiblioteca()

    gestorbiblioteca.registrarPrestamo(librito1)
    gestorbiblioteca.registrarPrestamo(librito2)
    gestorbiblioteca.devolverLibro(librito3)
    gestorbiblioteca.devolverLibro(librito2)


    /**
     *     fun UserMenu() {
     *         do {
     *             println("MENU:")
     *             println("1. Agregar Libro")
     *             println("2. Eliminar Libro")
     *             println("3. Registrar Préstamo")
     *             println("4. Devolver Libro")
     *             println("5. Disponibilidad Libro")
     *             println("6. Mostrar Libros")
     *             println("7. Salir")
     *             print("Ingrese su opción: ")
     *
     *             val opcion = readln().toIntOrNull()
     *
     *             when (opcion) {
     *                 1 -> gestorbiblioteca.agregarLibro()
     *                 2 -> gestorbiblioteca.eliminarLibro()
     *                 3 -> gestorbiblioteca.registrarPrestamo()
     *                 4 -> gestorbiblioteca.devolverLibro()
     *                 5 -> gestorbiblioteca.disponibilidadLibro()
     *                 6 -> gestorbiblioteca.retornarLibro()
     *                 else -> println("Opción no válida")
     *             }
     *         } while (opcion != 7)
     *     }
     */

}




