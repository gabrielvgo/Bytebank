package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaAndre = ContaCorrente(titular = "André", numeroConta = 1002)
    val contaFlavio = contaAndre
    contaFlavio.titular = "Flavio"
    contaFlavio.titular = "Andre"
    println("titular da conta: ${contaAndre.titular}")
    println("titular da conta: ${contaFlavio.titular}")

    println(contaAndre)
    println(contaFlavio)
}