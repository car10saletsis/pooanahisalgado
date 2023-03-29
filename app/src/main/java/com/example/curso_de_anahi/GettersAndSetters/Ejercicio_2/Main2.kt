package com.example.curso_de_anahi.GettersAndSetters.Ejercicio_2

import java.time.LocalDate
import java.time.Month

/*
En un casino puedes hacer un registro con correo, contraseña y fecha

El registro completo es con nombre, cumple años, contraseña, documento.

En caso de que se haga un login con una liga en particular el casino regalara 500 pesos

Las condiciones de los datos son
El nombre en mayúscula
Debe de ser mayor de 18 años
La contraseña deberá de tener más de 6 caracteres y menos de 10
Deberá de tener el documento cargado

Se solicita que al momento de cargar en el registro rápido muestre los datos y si tiene saldo o no

Al momento de cargar todos los datos tendrá un campo que pueda ser de validación y pueda retirar

 */





fun main() {

    val user1 = Casino(
        "algo@algo.com",
        "1234567",
         fecha = LocalDate.of(2000, Month.OCTOBER, 29)
    )

    val user1Registrado: Casino? = RegistroCasino().invoke(user1)

    if (user1Registrado != null){
        println("Usuario registrado con exito")
    } else {
        print("Usuario registrado sin exito")
    }

    val userFallido = Casino(
        "algo@algo.com",
        "1234567",
        fecha = LocalDate.of(2009, Month.OCTOBER, 29)
    )

    val userfRegistrado: Casino? = RegistroCasino().invoke(userFallido)

    if (userfRegistrado != null){
        println("Usuario registrado con exito")
    } else {
        print("Usuario registrado sin exito")
    }

    val userconstructor = Casino(
        "algo@algo.com",
        "1234567",
        fecha = LocalDate.of(2000, Month.OCTOBER, 29),
        "Algo perez",
        true,
        true,
        0
    )

    val userConsRegistrado: Casino? = RegistroCasino().invoke(userconstructor)

    if (userConsRegistrado != null){
        println("Usuario registrado con exito")
        println("Su email es: ${userConsRegistrado.email}")
        println("Su password cumple")
        println("Su nombre es: ${userConsRegistrado.nombre}")
        println("Cuenta con un saldo de: ${userConsRegistrado.saldo}")

    } else {
        print("Usuario registrado sin exito")
    }



    //Clase casino
    //
}