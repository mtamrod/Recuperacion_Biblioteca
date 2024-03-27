package org.pebiblioteca

/**
 * La clase GestorBiblioteca se encarga de la gestión de los libros sobre el catalogo.
 */
open class GestorBiblioteca(libro: Libro) {
    val catalogo: MutableList<Libro> = mutableListOf()
    var registro: MutableMap<Int, Estado> = mutableMapOf()

    /**
     * El método agregarLibro se encarga de añadir el nuevo Libro que se indique al catálogo (lista) de libros existentes.
     */
    fun agregarLibro(libro: Libro) {
        if (buscarLibro(libro) == null) {
            catalogo.add(libro)
        } else {
            println("El libro indicado ya existe")
        }
    }

    /**
     * buscarLibro controla si el libro es o no nulo.
     */
    fun buscarLibro(libro: Libro): Libro? {
        return catalogo.find { it.Id == libro.Id }
    }

    /**
     * El método eliminarLibro se encarga de eliminar un Libro del catálogo de libros existentes.
     */
    fun eliminarLibro(libro: Libro) {
        if (buscarLibro(libro) != null) {
            catalogo.remove(libro)
        } else {
            println("El libro indicado es inexistente")
        }
    }

    /**
     * El método registrarPrestamo cambia el estado de un Libro de PRESTADO a DISPONIBLE. En caso de que el Libro no esté DISPONIBLE no se cambia su estado.
     */
    fun registrarPrestamo(libro: Libro) {
        if (buscarLibro(libro) != null) {
            if (libro.estado != Estado.DISPONIBLE) {
                println("El libro ya está prestado")
            }
            libro.estado = Estado.PRESTADO
        } else {
            println("El libro indicado es inexistente")
        }
    }

    /**
     * El método devolverLibro modifica el estado del Libro a DISPONIBLE en caso de que esté PRESTADO. En caso contrario se quedará como DISPONIBLE.
     */
    fun devolverLibro(libro: Libro) {
        if (buscarLibro(libro) != null) {
            if (libro.estado != Estado.PRESTADO) {
                println("No se puede devolver un libro no prestado")
            }
            libro.estado = Estado.DISPONIBLE
        } else {
            println("El libro indicado es inexistente")
        }
    }

    /**
     * El metodo disponibilidadLibro se encarga comprobar el estado actual de un Libro sin modificarlo.
     */
    fun disponibilidadLibro(libro: Libro) {
        if (buscarLibro(libro) != null) {
            print("El Libro se encuentra ${libro.estado}")
        } else {
            println("El libro indicado es inexistente")
        }
    }

    /**
     * El método retornarLibro muestra un menú que se encarga de mostrar todos los libros que se encuentren en un estado determinado.
     * Puede mostrar todos los libros, los libros prestado o los libros disponibles.
     */
    fun retornarLibro(libro: Libro) {
        do {
            println("MENU:")
            println("1. Mostrar libros disponibles")
            println("2. Mostrar libros prestados")
            println("3. Mostrar todos los libros")
            println("4. Salir")
            print("Ingrese su opción: ")

            val opcion = readln().toIntOrNull()

            when (opcion) {
                1 -> println(catalogo.filter { it.estado == Estado.DISPONIBLE })
                2 -> println(catalogo.filter { it.estado == Estado.PRESTADO })
                3 -> println(catalogo)
                else -> println("Opción no válida")
            }
        } while (opcion != 4)
    }
}

