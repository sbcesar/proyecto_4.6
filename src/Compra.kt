/**
 * Clase que representa una compra.
 * @param cliente El cliente que realizó la compra.
 * @param dia El día del mes en que se realizó la compra.
 * @param monto El monto de la compra.
 */
data class Compra(var cliente: Cliente, var dia: Int, var monto: Double)