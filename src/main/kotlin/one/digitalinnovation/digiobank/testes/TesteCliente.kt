package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Cliente
import one.digitalinnovation.digiobank.ClienteTipo


fun main() {
    val carla = Cliente("Carla com C", "321.312.231-13", ClienteTipo.PF, "123456")

    println(carla)
    TesteAutenticacao().autentica(carla)

}
