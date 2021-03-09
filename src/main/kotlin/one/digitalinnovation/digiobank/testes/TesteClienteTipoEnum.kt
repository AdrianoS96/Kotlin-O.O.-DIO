package one.digitalinnovation.digiobank.testes

import one.digitalinnovation.digiobank.ClienteTipo

fun main() {

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
    }
/**
    ClienteTipo.values().forEach {it:ClienteTipo  ->
        println("${it.name} - $it")
    }
**/
}