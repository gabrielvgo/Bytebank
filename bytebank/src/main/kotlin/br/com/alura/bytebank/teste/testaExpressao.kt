package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1.0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema de conversão")
        null
    }

    var valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("Valor com taxa: $valorComTaxa")
    } else {
        println("Valor recebido inválido")
    }
}