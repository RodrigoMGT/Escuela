package main.kotlin.Class

class NationalLowSeason(override val ciudad: String) : Travel(), Cancelacion{

    override fun getPrice(numDias: Int): Int {
        val basePrice = when (ciudad) {
            "Santiago" -> 643
            "Valparaíso" -> 721
            "Vancouver" -> 620
            "Ottawa" -> 680
            "Montreal" -> 600
            else -> 0
        }
        val discountedPrice = (basePrice * numDias) * 0.8 // 20% discount for low season
        return discountedPrice.toInt()
    }

    override fun precioTotal(numDias: Int) {
        val precio = getPrice(numDias)
        if (precio == 0)
            println("\n\tNacional Temporada Baja: El viaje a $ciudad  NO SE PUEDE REALIZAR")
        else
            println("\nNacional Temporada Baja\n\tEl precio del viaje a $ciudad en temporada baja por $numDias días es de: $precio")
    }

    override fun cancelTrip() {
        reserved = false
        precio = 0
        println("\n\t¡Tu viaje a $ciudad fue cancelado exitosamente!")
    }
}