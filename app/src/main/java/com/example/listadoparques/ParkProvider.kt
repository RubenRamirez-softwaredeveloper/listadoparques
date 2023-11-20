package com.example.listadoparques

class ParkProvider {
    companion object {
        val parkList = listOf<Park>(
            Park(
                nombre = "Parque de los Principes",
                descripcion = "El parque de los Príncipes está ubicado en Sevilla.",
                photo = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Madrid_-_Puente_de_Toledo_-_20060902a.jpg/500px-Madrid_-_Puente_de_Toledo_-_20060902a.jpg"

            ),

            Park(
                nombre = "Parque del Retiro",
                descripcion = "El Retiro, es un jardín histórico y parque público" +
                              "situado en Madrid",
                photo = "https://patrimonioypaisaje.madrid.es/FWProjects/monumenta/Edificios/90002/03.05-img%201.jpg"
            ),

            Park(
                nombre = "Central Park",
                descripcion = "Central Park es un parque urbano situado en el distrito " +
                              "metropolitano de Manhattan",
                photo = "https://lh3.googleusercontent.com/p/AF1QipP4hTCPWa7L3bqg8LXjCgwJccO9XUmJL_w3IB2F=s1360-w1360-h1020"
            ),

            Park(
                nombre = "Parque de Belleville",
                descripcion = "El parque de Belleville es parques y jardín de" +
                              "el XX Distrito de París",
                photo = "https://lh5.googleusercontent.com/p/AF1QipMmjAzzElSiZleDiUPfNcL_KM8CxAx01X8JstA=w243-h244-n-k-no-nu"
            ),

            Park(
                nombre = "Parc de Bercy",
                descripcion = "El Parque de Bercy es un parque situado en París",
                photo = "https://parisjetaime.com/data/layout_image/fr-FR/Parc-de-Bercy-jardin-630x405-C-OTCP-Jacques-Lebar-I-162-24.jpg"
            )
        )
    }
}


