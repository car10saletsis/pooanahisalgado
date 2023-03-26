package com.example.curso_de_anahi.constructores

import java.time.LocalDateTime

class PostsIA(
    val name: String,
    val author: String,
    val date: LocalDateTime
) {

    var content: String = ""
    var category: String = ""

    constructor(
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String
    ) : this (name, author, date){
        this.category = category
        this.content = content

    }

    fun imprimir(){
        println("Nombre: $name")
        println("Autor: $author")
        println("Dia: $date")
        if (category.isNotEmpty() && category.isNotBlank()){
            println("Categoria: $category")
        }
        if (content.isNotBlank() && content.isNotBlank()){
            println("Comentario: $content")
        }
    }

}