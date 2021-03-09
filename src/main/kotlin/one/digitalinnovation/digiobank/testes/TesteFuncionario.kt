package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Pessoa
import java.math.BigDecimal

fun main() {
    val adriano = Pessoa(nome = "Adriano", cpf = "123.123.123-12")

    println(adriano.nome)
    println(adriano.cpf)

    val rita = Funcionario("Rita","113.113.113-11", BigDecimal.valueOf(1000.0))

    println("Nome: ${rita.nome}\nCPF: ${rita.cpf}\nSalário: ${rita.salario}")
}