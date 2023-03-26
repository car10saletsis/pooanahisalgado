package com.example.curso_de_anahi.Ejercicios

fun main() {
    val yaris = Autp(
    "Toyota", "yaris", "2022", 100000, "rojo"
    )

    val chevy= Autp(
    "chevroley", "sonic", "2014", km = 20000, "azul"
    )

    yaris.conducir()
    yaris.informacion()

    chevy.conducir()
    chevy.informacion()
}