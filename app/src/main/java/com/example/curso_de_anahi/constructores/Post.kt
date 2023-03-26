package com.example.curso_de_anahi.constructores

import android.icu.util.ULocale
import java.time.LocalDateTime
import java.util.*

class Post (
    val name: String,
    val author: String,
    val date: LocalDateTime
) {

    var body: String = ""
    var category: String = ""

    constructor(
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String
    ) : this(name, author, date){
        body = content
        this.category = category

    }


    fun publish(): String {
        return """
            Post Name: $name
            Author: $author
            Date: $date
            ${getContent()}
            ${getCategorySection()}
        """.trimIndent()
    }

    private  fun getContent(): String{
        return if (body.isNotEmpty() && body.isNotBlank()){
            """
                Content: $body
            """.trimIndent()
        } else " "
    }

    private fun getCategorySection(): String{
        return if (category.isNotBlank() && category.isNotEmpty()){
            return """
                Category: $category
            """.trimIndent()
        } else " "
    }

}