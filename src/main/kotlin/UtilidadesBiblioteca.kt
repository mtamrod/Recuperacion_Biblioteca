package org.pebiblioteca

import java.util.*

open class UtilidadesBiblioteca {
    companion object {
        fun generarIdentificadorUnico(): UUID? {
            val uuid = UUID.randomUUID()
            return uuid
        }
    }
}