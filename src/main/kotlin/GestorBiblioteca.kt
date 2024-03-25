package org.pebiblioteca

/**
 * La clase GestorBiblioteca se encarga de la gestión de los libros sobre el catalogo-
 */
class GestorBiblioteca(libro: Libro) {
    val catalogo = mutableListOf(libro)
    var registro = listOf(libro.estado)
    /**
     * El método agregarLibro se encarga de añadir el nuevo Libro que se indique al catálogo (lista) de libros existentes.
     */
    fun agregarLibro (libro: Libro) {
        catalogo.add(libro)
    }

    /**
     * El método eliminarLibro se encarga de quitar un Libro del catálogo (lista) de libros existentes.
     */
    fun eliminarLibro (libro: Libro) {
        catalogo.remove(libro)
    }

    /**
     * El método registrarPrestamo se encarga de cambiar el estado de un Libro a prestado si el Libro si verifica que está disponible. En caso de que el Libro no esté disponible no se podrá cambiar el estado a prestado.
     */
    fun registrarPrestamo (libro: Libro) {
        if (libro.estado == "disponible") {
            libro.estado = "prestado"
        } else {
            println("El Libro indicado no se encuentra disponible")
        }
        registro += ""
    }

    /**
     * El método devolverLibro se encarga de modificar el estado del Libro a disponible y si este estaba prestado. En caso contrario su estado se quedará como disponible.
     */
    fun devolverLibro (libro: Libro) {
        if (libro.estado == "prestado") {
            libro.estado = "disponible"
        }
    }

    /**
     * El método disponibilidadLibro se encarga comprobar el estado actual de un Libro sin modificarlo.
     */
    fun disponibilidadLibro (libro: Libro) {
        print("El Libro se encuentra ${libro.estado}")
    }

    /**
     * El método mostrarLibro se encarga de mostrar todos los libros que se encuentren en un estado fitrados por:
     * "todos": que muestra todos los libros.
     * "disponible": que muestra todos los libros disponibles.
     * "prestado": que muestra todos los libros prestados.
     */
    fun mostrarLibro (libro: Libro) {

    }
}