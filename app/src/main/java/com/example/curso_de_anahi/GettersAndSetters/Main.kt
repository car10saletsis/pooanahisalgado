package com.example.curso_de_anahi.GettersAndSetters

import java.time.LocalDate
import java.time.Month

fun main() {
    //User
    //Email
    //Password
    //Birtdhate
    //Gender

    //Register user

    val user = User(
        "PRUEBA@PRUEBA.COM",
        "123456",
        birthdate = LocalDate.of(1990, Month.MARCH, 23),
        'F'
    )
    val userRegistered: User? = RegisterUser().invoke(user)

    if (userRegistered != null){
        println("User Registeresd: ${userRegistered.email}")
        println("User Registered: ${userRegistered.password}")
    } else {
        println("No se registro")
    }

}