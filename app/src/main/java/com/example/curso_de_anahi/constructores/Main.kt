package com.example.curso_de_anahi.constructores

import java.time.LocalDateTime
import java.time.Month

fun main() {
    val post = Post(
        "Tutpr9al Kotlin",
        "Anahi salgado",
        date = LocalDateTime.of(
            2022,
            Month.MARCH,
            20,
            12,
            11
        )

    )

    println(post.publish())

    val seconPost = Post(
        "Segundo post",
        "Yo merengues",
         date = LocalDateTime.of(
             2022,
             Month.AUGUST,
             23,
             13,
             23
         ),
        "Esto es comentario",
        "Terror"
    )

    println(seconPost.publish())


}