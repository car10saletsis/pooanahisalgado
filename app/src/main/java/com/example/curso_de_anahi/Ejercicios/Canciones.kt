package com.example.curso_de_anahi.Ejercicios

/*Muestra en pantalla 3 canciones reproduciendose de la siguiente manera
1. Pon la segunda cancion mostrando el titulo y el artista
2. Detenla y muestra el titulo de la cancion detenida
3. pon la tercer cancion y muestra nuevamente el titulo y artista
 */

fun main() {
    //Instanciando objetos

    val secondSong = Song(
        title = "Anathema",
        artist = "Untouchable"
    )

    val firstSong = Song(
        title = "Locust",
        artist = "The ocean"
    )

    val thirdSong = Song(
        title = "Spaceman",
        artist = "David Bowie"
    )

    //Usando los componentes

    secondSong.play()
    secondSong.stop()
    thirdSong.play()

}