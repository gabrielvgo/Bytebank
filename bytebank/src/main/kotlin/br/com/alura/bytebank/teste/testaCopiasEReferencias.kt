package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaAndre = ContaCorrente(
        Cliente(
            nome = "André",
            cpf = "444.444.444-44",
            senha = 3
        ), numeroConta = 1002
    )

    val contaFlavio = contaAndre

    contaFlavio.titular.nome = "Flavio"
    contaFlavio.titular.nome = "Andre"
    println("titular da conta: ${contaAndre.titular}")
    println("titular da conta: ${contaFlavio.titular}")

    println(contaAndre)
    println(contaFlavio)
}