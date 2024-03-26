package org.pebiblioteca

/**
 * La clase Libro contiene todos los datos necesarios para los libros, no contiene ninguna lógica asociada.
 */
data class Libro(var Id: Int, val titulo: String, val autor: String, val ano_publicacion: Int, val tematica: String, var estado: Estado = Estado.DISPONIBLE) {
    init {
        requireNotNull(Id) { "Este campo no puede estar vacío" }
        requireNotNull(titulo) { "Este campo no puede estar vacío" }
        requireNotNull(autor) { "Este campo no puede estar vacío" }
        requireNotNull(ano_publicacion) { "Este campo no puede estar vacío" }
        requireNotNull(tematica) { "Este campo no puede estar vacío" }
    }
}

enum class Estado {
    DISPONIBLE,
    PRESTADO
}