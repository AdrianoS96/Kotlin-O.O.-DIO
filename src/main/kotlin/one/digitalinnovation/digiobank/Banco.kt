package one.digitalinnovation.digiobank

data class Banco(
    val nome:String,
    val numero:Int
){
    fun info() = "Nome do Banco: $nome \nNúmero do Banco: $numero"
}
