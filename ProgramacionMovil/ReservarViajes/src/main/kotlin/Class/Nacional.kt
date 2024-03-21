package main.kotlin.Class

class National(override val ciudad: String) : Travel() {
    override fun getPrice(numDias: Int): Int {
        val precioFijo = when (ciudad) {
            "Santiago" -> 643
            "Valparaíso" -> 721
            "Vancouver" -> 620
            "Ottawa" -> 680
            "Montreal" -> 600
            else -> 0
        }
        return precioFijo * numDias
    }

    override fun precioTotal(numDias: Int) {
        val precio = getPrice(numDias)
        if (precio <= 0)
            println("\n\tNacional: El viaje a $ciudad NO SE PUEDE REALIZAR")
        else
            println("\nNacional\n\tEl precio del viaje a $ciudad por $numDias días es de: $precio")
    }
}