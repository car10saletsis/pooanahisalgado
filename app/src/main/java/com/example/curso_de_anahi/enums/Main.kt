package com.example.curso_de_anahi.enums

import com.example.curso_de_anahi.enums.constructor.Color
import com.example.curso_de_anahi.enums.constructor.ErrorType

fun main() {
    val coneectionType = ConnectionType.WIFI
    println(coneectionType)

    val color = Color.WHITE.hexa

    println(color)

    val errors = ErrorType.COONECTIVITY_ERROR

    println(errors)

}