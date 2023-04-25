package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val contaGabriel = ContaCorrente(Cliente(
        nome = "Gabriel",
        cpf = "222.222.222-22",
        senha = 1
    ), numeroConta = 1000)
    contaGabriel.deposito(valor = 200.0)

    println("Titular da conta: ${contaGabriel.titular}")
    println("Número da conta: ${contaGabriel.numeroConta}")
    println("Saldo da conta: ${contaGabriel.saldo}")
    println("************************************")

    val contaSonia = ContaPoupanca(Cliente(
        nome = "Sônia",
        cpf = "333.333.333-33",
        senha = 2
    ), numeroConta = 1001)
    contaSonia.deposito(valor = 300.0)

    println("Titular da conta: ${contaSonia.titular}")
    println("Número da conta: ${contaSonia.numeroConta}")
    println("Saldo da conta: ${contaSonia.saldo}")
    println("************************************")

    println("Depositando na conta do Gabriel")
    contaGabriel.deposito(valor = 50.0)
    println("Novo saldo após depósito: ${contaGabriel.saldo}")
    println("************************************")

    println("Depositando na conta da Sônia")
    contaSonia.deposito(valor = 70.0)
    println("Novo saldo após depósito: ${contaSonia.saldo}")
    println("************************************")

    println("Sacando da conta do Gabriel")
    contaGabriel.saque(valor = 100.0)
    println("Novo saldo após saque: ${contaGabriel.saldo}")
    println("************************************")

    println("Sacando da conta da Sônia")
    contaSonia.saque(valor = 150.0)
    println("Novo saldo após saque: ${contaSonia.saldo}")
    println("************************************")

    println("Transferência da conta da Sônia para Gabriel")
    if (contaSonia.transferencia(valor = 300.0, destino = contaGabriel)) {
        println("Transferência realizada")
    } else {
        println("Transferência não realizada")
    }

    println("Novo saldo após transferência: ${contaSonia.saldo}")
    println("Novo saldo após transferência: ${contaGabriel.saldo}")
}