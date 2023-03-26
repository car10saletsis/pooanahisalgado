package com.example.curso_de_anahi.GettersAndSetters.Ejercicio

import java.time.LocalDate
import java.time.Month

/*En un equipo de fútbol se puede inscribir jugadores con nombre y fecha de nacimiento

O un registro completo con nombre, fecha de nacimiento, posición y dorsal

El nombre deberá de estar en mayúscula

La fecha de nacimiento de era ser mayor a 15 pero menor a 40

La posición será "por", "def", "med" "del"

El dorsal deberá ser mayor que 0 y menor que 100

Cuando el registro sea exitoso deberá de sacar un mensjae con los datos

Cuando sea erróneo debería decir que no se pudo completar

En el registro rápido deberá de arrojar un número aleatorio */

fun main() {
    //Name
    //Cumple
    //Posicion
    //Dorsal

    val player = Player(
        "pepe pica papas",
        cumple = LocalDate.of(2000, Month.AUGUST,23)
    )
    val registroPlayer: Player? = Registro().invoke(player)

    if (registroPlayer != null){
        println("Nombre: ${registroPlayer.name}")
        println("Edad: ${registroPlayer.cumple}")
        println("Dorsal: ${registroPlayer.dorsal}")
    } else {
        println("No se registro")
    }

    println("*******************************")

  val player2 = Player(
      "aletsis orozco",
      cumple = LocalDate.of(1999, Month.OCTOBER, 29),
      23,
      "Del"
  )

    val registroPlayer2: Player? = Registro().invoke(player2)

    if (registroPlayer2 != null){
        println("Nombre: ${registroPlayer2.name}")
        println("Cumple: ${registroPlayer2.cumple}")
        println("Dorsal: ${registroPlayer2.dorsal}")
        println("posicion: ${registroPlayer2.position}")

    } else {
        println("No se registro")
    }

    //Register user

}