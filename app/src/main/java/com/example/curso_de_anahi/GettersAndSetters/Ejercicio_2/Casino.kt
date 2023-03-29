package com.example.curso_de_anahi.GettersAndSetters.Ejercicio_2

import java.time.LocalDate


/*
En un casino puedes hacer un registro con correo, contraseña y fecha

El registro completo es con nombre, cumple años, contraseña, documento.

En caso de que se haga un login con una liga en particular el casino regalara 500 pesos

Las condiciones de los datos son

Deberá de tener el documento cargado

Se solicita que al momento de cargar en el registro rápido muestre los datos y si tiene saldo o no

Al momento de cargar todos los datos tendrá un campo que pueda ser de validación y pueda retirar

 */
class Casino
    (email: String,
    password: String,
    fecha: LocalDate,
    )
{
    private val yearNow = LocalDate.now()
    var isValid: Boolean = true
    //var saldo: Int = 0
   // private val liga: Boolean = false

    var email: String = email
    set(value) {
        field = value.uppercase()
    }

    var fecha: LocalDate = yearNow
        set(value) {
            val edad = yearNow.year - value.year
            field = if (edad > 18){
                value
            } else {
                isValid = false
                yearNow
            }
        }

    var password: String = password
        set(value) {
            field = if (value.length in 7..17) {
                value
            } else {
                isValid = false
                ""
            }
        }

    init {
        this.email = email
        this.fecha = fecha
        this.password = password
    }

        constructor(
            email: String,
            password: String,
            fecha: LocalDate,
            nombre: String,
            liga: Boolean,
            document: Boolean,
            saldo: Int
        ) : this (email, password, fecha){
            this.nombre = nombre
            this.document = document
            this.liga = liga
            this.saldo = saldo
        }

    var nombre: String = " "
    set(value) {
        field = if (value.isNotEmpty() && value.isNotBlank()){
            value
        } else {
            isValid = false
            " "
        }
    }

    var document: Boolean = false
    set(value) {
        field = if (!value){
            value
        } else {
            isValid = true
            true
        }
    }

    var liga: Boolean = false
    set(value) {
        field = if (!value){
            value
        } else {
            true
        }
    }

    var saldo: Int = 0
        set(value) {
            field = if(liga){
                600
            } else {
                0
            }
        }
}