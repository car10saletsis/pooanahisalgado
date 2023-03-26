package com.example.curso_de_anahi.GettersAndSetters

class RegisterUser {
    fun invoke(user: User): User?{
        return if (user.isValid) user else null
    }
}