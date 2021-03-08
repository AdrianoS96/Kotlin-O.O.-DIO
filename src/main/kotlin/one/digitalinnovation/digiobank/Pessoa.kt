package one.digitalinnovation.digiobank

class Pessoa {

    var  nome:String = "Adriano"
    var cpf:String ="123.123.123-12"

}
fun main(){

    val adriano = Pessoa()

    println(adriano.nome)
    println(adriano.cpf)

}