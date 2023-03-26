package com.example.curso_de_anahi.constructores.Ejercicios

fun main() {
    val triangulo = Triangulo(
        "2"
    )

    println(triangulo.publicar())

    val trianguloC = Triangulo(
    "2",
        "4",
        "5"
    )

    println(trianguloC.publicar())
}