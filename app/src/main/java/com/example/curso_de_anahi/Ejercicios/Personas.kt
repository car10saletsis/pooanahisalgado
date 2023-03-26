package com.example.curso_de_anahi.Ejercicios

fun main() {

    val pepe = Persona(
        "pepe",
        "rodriguez",
        23,
        "masculino",
        "pepe@gmail.com"
    )

    val alejandro = Persona(
        "Alejandro",
        "Martinez",
        45,
        "masculino",
        "alex@secoco.com"
    )

    pepe.presentarse()
    pepe.presentacion()

    alejandro.presentarse()
    alejandro.presentacion()

   alejandro.cambiaremail()

    alejandro.presentacion()
}