import main.kotlin.Class.International
import main.kotlin.Class.National
import main.kotlin.Class.NationalLowSeason

fun main() {
    val viajeError = International("Valparaíso", "Alemania")
    viajeError.precioTotal(15)
    viajeError.reserve(15)

    val viajeCorrecoto = International("Montreal", "Canadá")
    viajeCorrecoto.precioTotal(3)
    viajeCorrecoto.reserve(3)

    val viajeNacional = National("Santiago")
    viajeNacional.precioTotal(5)
    viajeNacional.reserve(5)

    val viajeTemBaja = NationalLowSeason("Vancouver")
    viajeTemBaja.precioTotal(3)
    viajeTemBaja.reserve(3)
    viajeTemBaja.cancelTrip()
}