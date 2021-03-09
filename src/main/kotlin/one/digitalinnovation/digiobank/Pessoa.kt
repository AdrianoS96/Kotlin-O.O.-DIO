package one.digitalinnovation.digiobank

class Pessoa { //alter class

    var  nome:String = "Adriano"
    var cpf:String ="123.123.123-12"
    private set  // utilizado para deixar o método set do atributo acima em modo PRIVATE
/**
 * possibilidade de criar a inner class
 * uma espécie de subclass

    inner class Endereco{
        var rua:String = "Rua teste"
    }
**/

}
fun main(){

    val adriano = Pessoa()
    adriano.nome = "djajla"
    println(adriano.nome)
    println(adriano.cpf)

}