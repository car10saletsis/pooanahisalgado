package com.example.curso_de_anahi.Ejercicios

class Persona(
    val nopmbre: String,
    val apellido: String,
    val edad: Int,
    val genero: String,
    var email: String
) {
    fun presentarse(){
        println("$nopmbre $apellido, $edad, $genero")
    }

    fun presentacion(){
        println("Hola me llamo $nopmbre $apellido, tengo $edad y este mensaje sera mandado a $email")
    }

    fun cambiaremail(){
        email = readln()
    }
}