package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.Analista
import one.digitalinnovation.digiobank.Funcionario


fun main() {


    val rita = Analista("Rita Maria","113.113.113-11", 1000.0)

  //  println("Nome: ${rita.nome}\nCPF: ${rita.cpf}\nSalário: ${rita.salario}")

    ImprimeRelatorioFuncionario.imprime(rita)

}


