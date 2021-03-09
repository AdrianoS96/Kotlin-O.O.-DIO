package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Gerente

fun main() {
    val leticia= Gerente("Leticia taxista","113.113.113-11", 3000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(leticia)
    TesteAutenticacao().autentica(leticia)
}