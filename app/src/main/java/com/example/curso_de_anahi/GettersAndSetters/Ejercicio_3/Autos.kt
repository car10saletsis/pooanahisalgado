package com.example.curso_de_anahi.GettersAndSetters.Ejercicio_3

import androidx.lifecycle.viewmodel.viewModelFactory
import java.time.LocalDate

/*
En una agencia automotriz de segunda mano ingresan coches con modelo, año, y color como ingreso rápido

Pero al terminar la carga deberá de tener los datos mencionados.mas kilometraje, marca y costo nuevo

Los coches que se puedan vender deberán de tener menos de 10 años de antigüedad y menos de 15000 kilometraje por año obtenido

Solo se podrán registrar coches de unas marcas

El costo bajara en 10% por cada año que haya transcurrido
 */


class Autos (
    modelo: String,
    year: Int,
    color: String
        ){


    var esValido: Boolean = true

    private var acumulado: Int = 0
    private val listaMarcas = listOf("chevrolet", "mazda", "ford", "audi")

    var year: Int = year
    set(value) {
        val tiempo = LocalDate.now().year - value
        field = if (tiempo < 10){
            acumulado = tiempo
            value
        } else {
            esValido = false
            12
        }
        costo *= 1 - tiempo * 0.1

    }

    var modelo: String = modelo
    var color: String = color

    init {
        this.year = year
        this.modelo = modelo
        this.color = color
    }



    constructor(
        modelo: String,
        year: Int,
        color: String,
        km: Int,
        marca: String,
        costo: Double
    ): this(modelo, year, color) {
        this.km = km
        this.marca = marca
        this.costo = costo
    }

    private var total: Int =
        if (acumulado > 10){
            0
        } else {
            acumulado * 15000
        }


    var km: Int = 0
    set(value) {
        field = if (total > value){
            value
        } else {
            esValido = false
            0
        }
    }

    var marca: String = ""
        set(value) {
        field = if (listaMarcas.contains(value)){
            value
        } else {
            esValido = false
            ""
        }
    }

    val deduccion: Double
        get() = 1.00 - (acumulado * 0.1)

    var costo: Double = 0.0
        set(value) {

            field = value * deduccion
        }


}