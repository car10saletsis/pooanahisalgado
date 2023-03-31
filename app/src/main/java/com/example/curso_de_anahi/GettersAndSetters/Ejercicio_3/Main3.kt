package com.example.curso_de_anahi.GettersAndSetters.Ejercicio_3

/*
En una agencia automotriz de segunda mano ingresan coches con modelo, año, y color como ingreso rápido

Pero al terminar la carga deberá de tener los datos mencionados.mas kilometraje, marca y costo nuevo

Los coches que se puedan vender deberán de tener menos de 10 años de antigüedad y menos de 15000 kilometraje por año obtenido

Solo se podrán registrar coches de unas marcas

El costo bajara en 10% por cada año que haya transcurrido
 */

fun main() {
    val coches = Autos(
        "chevy",
        2020,
        "rojo"
    )

    val auto1: Autos? = ResgistroCoches().invoke(coches)

    if (auto1 != null){
        println("El modelo es: ${auto1.modelo}")
        println("el year es: ${auto1.year}")
        println("el color es: ${auto1.color}")
    } else {
        println("No se registro")
    }


    val coches1 = Autos(
        "Corolla",
        2014,
        "Amarillo,",
        1499900,
        "mazda",
        250000.00
    )

    val auto2: Autos? = ResgistroCoches().invoke(coches1)
    if (auto2 != null){
        println("El modelo es: ${auto2.modelo}")
        println("El year es: ${auto2.year}")
        println("El color es: ${auto2.color}")
        println("el Kilometraje es: ${auto2.km}")
        println("La marca es: ${auto2.marca}")
        println("El costo es: ${auto2.costo}")
    } else {
        println("No cumple con los requisitos")
    }


}