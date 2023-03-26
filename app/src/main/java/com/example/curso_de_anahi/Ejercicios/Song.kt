package com.example.curso_de_anahi.Ejercicios

class Song(
    //Atributos
    val title: String,
    val artist: String
) {
   //Funcionalidades
    fun play(){
        println("Playing $title - $artist")
    }

    fun stop(){
        println("Stopping $title")
    }

}