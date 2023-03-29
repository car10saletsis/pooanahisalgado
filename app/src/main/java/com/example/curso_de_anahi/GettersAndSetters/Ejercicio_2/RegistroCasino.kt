package com.example.curso_de_anahi.GettersAndSetters.Ejercicio_2

class RegistroCasino {
    fun invoke(casino: Casino): Casino?{
        return if (casino.isValid) casino else null
    }
}