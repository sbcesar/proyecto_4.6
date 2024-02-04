/**
 * Clase que representa un repositorio de compras.
 */
class RepositorioCompras {
    private val compras = mutableListOf<Compra>()

    /**
     * Agrega una compra al repositorio.
     * @param compra La compra a agregar.
     */
    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    /**
     * Retorna los domicilios únicos de los clientes a los que se les debe enviar una factura de compra.
     * @return Un conjunto de cadenas con los domicilios únicos.
     */
    fun domicilios(): Set<String> {
        val domiciliosUnicos = mutableSetOf<String>()

        for (compra in compras) {
            domiciliosUnicos.add(compra.cliente.domicilio.dirCompleta())
        }
        return domiciliosUnicos
    }
}