package main.kotlin.Class

abstract class Travel {
    abstract val ciudad: String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var precio = 0

    fun reserve(numDays: Int) {
        if (reserved) {
            println("""¡Ya reservaste tu viaje! 
                       Ciudad: $ciudad
                       Precio: $precio""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if (amount == 0) {
            return
        }
        reserved = true
        precio = amount
        if(precio>=0)
        println("""¡Viaje reservado exitosamente! 
                       Ciudad: $ciudad
                       Precio: $precio""".trimMargin())
    }

    protected abstract fun getPrice(numDias: Int): Int

    abstract fun precioTotal(numDias: Int)
}