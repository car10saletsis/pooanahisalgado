package com.example.curso_de_anahi.GettersAndSetters.Ejercicio_3

class ResgistroCoches {
    fun invoke(autos: Autos): Autos?{
        return if (autos.esValido) autos else null
    }
}