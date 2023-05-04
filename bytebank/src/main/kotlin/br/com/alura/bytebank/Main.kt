package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Varginha", complemento = "prédio laranja")
//    println(enderecoNulo?.logradouro?.length?.toUByte()) precisa sempre colocar ? nesse caso
    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    teste(valor = 1)
    teste(valor = "")
}

fun teste(valor: Any) {
    val numero: Any? = valor as? Int
    println(numero)
}