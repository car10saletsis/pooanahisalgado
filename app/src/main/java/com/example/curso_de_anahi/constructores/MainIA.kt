package com.example.curso_de_anahi.constructores

import java.time.LocalDateTime
import java.time.Month

fun main() {
    val iA = PostsIA(
        "Tutorial de kotlin",
        "Pepe pepe",
        date = LocalDateTime.of(
            2022,
            Month.MARCH,
            20,
            12,
            11
        )
    )

    val iA2 = PostsIA(
        "Pruebas con segyundo",
        "Yo merengues",
        date = LocalDateTime.of(
            2022,
            Month.MAY,
            13,
            11,
            12
        ),
        "El comentario",
        "Terror"
    )

    iA.imprimir()
    println(" ")
    println(" ")
    iA2.imprimir()
}