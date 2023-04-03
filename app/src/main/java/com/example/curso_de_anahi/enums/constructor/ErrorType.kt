package com.example.curso_de_anahi.enums.constructor

enum class ErrorType (
    val message: String
    ){
    COONECTIVITY_ERROR("Error en la conexion"){
        override val userMessage: String = "Error de conexion"
        override fun getCodeError(): String = "CE001"
        override fun getRetryIntents(): Int = 3
    },
    UNKNOWN_ERROR("Error desconocido"){
        override val userMessage: String = "Error desconocido"
        override fun getCodeError(): String = "UE001"
        override fun getRetryIntents(): Int = 2
    },
    NOT_LOGGED_IN_ERROR("Not logged in error") {
        override val userMessage: String = "Not logged"
        override fun getCodeError(): String = "NLG01"
        override fun getRetryIntents(): Int =3
    };

    abstract val userMessage: String
    abstract fun getCodeError(): String
    open fun getRetryIntents(): Int = 1

    /*
    Con abstract es obligatorio y con open es opcional
     */

}