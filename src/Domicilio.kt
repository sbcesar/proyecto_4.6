/**
 * Clase que representa un domicilio.
 * @param calle El nombre de la calle.
 * @param numero El número del domicilio.
 */
data class Domicilio(val calle: String,val numero: Int) {

    fun dirCompleta(): String {
        return "$calle, $numero"
    }
}