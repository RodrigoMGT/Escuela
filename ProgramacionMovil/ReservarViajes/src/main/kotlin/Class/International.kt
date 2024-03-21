package main.kotlin.Class

class International(override val ciudad: String, val pais: String) : Travel() {
    override fun getPrice(numDias: Int): Int {
        var impPais = 0f;
        var precioFijo = 0f;
        var bandera = true;

        if (pais == "Alemania" && (ciudad == "Munich" || ciudad == "Berlín" || ciudad == "Francfort")) {
            impPais = 0.16f
            precioFijo = when (ciudad) {
                "Munich" -> 980f
                "Berlín" -> 820f
                "Francfort" -> 850f
                else -> 0f
            }
        } else if (pais == "Chile" && (ciudad == "Santiago" || ciudad == "Valparaíso")) {
            impPais = 0.05f
            precioFijo = when (ciudad) {
                "Santiago" -> 643f
                "Valparaíso" -> 721f
                else -> 0f
            }
        } else if (pais == "Canadá" && (ciudad == "Vancouver" || ciudad == "Ottawa" || ciudad == "Montreal")) {
            impPais = 0.10f

            precioFijo = when (ciudad) {
                "Vancouver" -> 620f
                "Ottawa" -> 680f
                "Montreal" -> 600f
                else -> 0f
            }
        } else
            bandera = false;

        //Se valida si se eligen el pais y la ciudad correspondiente a ese pais
        if (bandera) {
            val total = precioFijo * numDias
            return (total * (1f + impPais)).toInt()
        } else
            return -1;
    }

    override fun precioTotal(numDias: Int) {
        val precio = getPrice(numDias)
        if (precio < 0)
            println("\n\tEl viaje a $ciudad en $pais NO SE PUEDE REALIZAR")
        else
            println("\nInternacional\n\tEl precio del viaje a $ciudad en $pais por $numDias días es de: $precio")
    }
}