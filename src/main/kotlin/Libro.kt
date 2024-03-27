package org.pebiblioteca

import java.util.*

/**
 * La clase Libro contiene todos los datos necesarios para los libros, no contiene ninguna lógica asociada.
 */
data class Libro(
    val uuid: UUID?,
    val titulo: String?,
    val autor: String?,
    val fecha_publicacion: Int,
    val tematica: String?,
    var estado: Estado = Estado.DISPONIBLE
) {
    init {
        requireNotNull(uuid) { "Este campo no puede estar vacío" }
        requireNotNull(titulo) { "Este campo no puede estar vacío" }
        requireNotNull(autor) { "Este campo no puede estar vacío" }
        requireNotNull(tematica) { "Este campo no puede estar vacío" }
    }
}

enum class Estado {
    DISPONIBLE,
    PRESTADO
}