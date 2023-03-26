package com.example.curso_de_anahi.GettersAndSetters.Ejercicio

import java.time.LocalDate
import kotlin.random.Random

class Player(
    name: String,
    cumple: LocalDate
) {

    private val posiciones = listOf<String>("por", "def", "med", "del")
    private val dateNow = LocalDate.now()
    private val number= Random.nextInt(101)

    var isValid: Boolean = true

    var name: String = name
        set(value) {
            field = value.uppercase()
        }

    var cumple: LocalDate = dateNow
        set(value) {
            val age = dateNow.year - value.year
            field = if (age > 16 && age < 40){
                value
            } else {
                isValid = false
                dateNow
            }
        }

    init {
        this.name = name
        this.cumple = cumple
    }

    constructor(
        name: String,
        cumple: LocalDate,
        dorsal: Int,
        position: String): this(name, cumple){
            this.dorsal = dorsal
            this.position = position

        }

    var dorsal: Int = number
        set(value) {
            field = if (number != 100) {
                value
            } else {
                Random.nextInt(101)
            }

        }

    var position: String = "N"
        set(value) {
            val minus = value.lowercase()
            field = if (posiciones.contains(minus)){
                value
            } else{
                isValid = false
                "N"
            }
        }
}