fun main() {
    val repositorioCompras = RepositorioCompras()

    val cliente1 = Cliente("Nuria Costa", Domicilio("Calle Las Flores", 355))
    val cliente2 = Cliente("Jorge Russo", Domicilio("Mirasol", 218))
    val cliente3 = Cliente("Julián Rodriguez", Domicilio("La Mancha", 761))

    repositorioCompras.agregarCompra(Compra(cliente1, 5, 12780.78))
    repositorioCompras.agregarCompra(Compra(cliente2, 7, 699.0))
    repositorioCompras.agregarCompra(Compra(cliente1, 7, 532.90))
    repositorioCompras.agregarCompra(Compra(cliente3, 12, 5715.99))
    repositorioCompras.agregarCompra(Compra(cliente2, 15, 958.0))

    val domiciliosUnicos = repositorioCompras.domicilios()

    println("Domicilios de clientes a los que se les debe enviar una factura de compra:")
    domiciliosUnicos.forEach { println(it) }
}