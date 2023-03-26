package com.example.curso_de_anahi.Ejercicios

class Autp(
    val marca: String,
    val modelo: String,
    val year: String,
    var km: Int,
    val color: String

) {
    fun conducir(){
        km = km + 10
    }

    fun informacion(){
        println("el auto es de la marca $marca, modelo $modelo, year $year, kilometraje $km y de color $color")
    }
}