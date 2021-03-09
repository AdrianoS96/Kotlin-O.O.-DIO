package one.digitalinnovation.digiobank

abstract class Pessoa(
    val nome:String,
    val cpf:String
)

    /**
    var  nome:String = "Adriano"
    var cpf:String ="123.123.123-12"
    private set  // utilizado para deixar o método set do atributo acima em modo PRIVATE

    // constructor()

    fun pessoaInfo() = "Nome: $nome \nCPF: $cpf"

 * possibilidade de criar a inner class
 * uma espécie de subclass

    inner class Endereco{
        var rua:String = "Rua teste"
    }
**/