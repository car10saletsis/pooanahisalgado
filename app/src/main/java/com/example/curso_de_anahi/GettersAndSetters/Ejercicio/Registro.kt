package com.example.curso_de_anahi.GettersAndSetters.Ejercicio

class Registro {
    fun invoke(player: Player): Player?{
        return if (player.isValid) player else null
    }
}