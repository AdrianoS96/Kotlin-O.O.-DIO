package one.digitalinnovation.digiobank


abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario:Double
):Pessoa(nome, cpf){
protected abstract fun calculoAuxilio() :Double

    override fun toString(): String ="""
        Nome: $nome
        CPF: $cpf
        Salário:R$ $salario
        Auxílio: R$ ${calculoAuxilio()}
    """.trimIndent()

}