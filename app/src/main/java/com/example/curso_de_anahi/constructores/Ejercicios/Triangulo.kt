package com.example.curso_de_anahi.constructores.Ejercicios

/*Crea una clase Triangulo con un constructor primario que acepte tres parámetros: el lado A, el
lado B y el lado C. Crea un constructor secundario que acepte solo el lado A, y establezca los
lados B y C en 0.
 */

class Triangulo (
    val sideA: String,
    ){

    var ladoB: String = ""
    var ladoC: String = ""

    constructor(
        sideA: String,
        sideB: String,
        sideC: String
    ): this (sideA){
        ladoB = sideB
        ladoC = sideC
    }

    fun publicar(): String{
        return """
            Lado A: $sideA
            ${getSideB()}
            ${getSideC()}
            
        """.trimIndent()
    }

    private  fun getSideB(): String{
        return if (ladoB.isNotEmpty() && ladoB.isNotBlank()){
            """
                Side B: $ladoB
            """.trimIndent()
        } else "Side B: 0"
    }

    private  fun getSideC(): String{
        return if (ladoC.isNotEmpty() && ladoC.isNotBlank()){
            """
                Side C: $ladoC
            """.trimIndent()
        } else "Side C: 0"
    }
}