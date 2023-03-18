package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = "Gabriel",
        numeroConta = 2001
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Sônia",
        numeroConta = 2002
    )

    val contaSalario = ContaSalario(
        titular = "Filipe",
        numeroConta = 2003
    )

    contaCorrente.deposito(valor = 1000.0)
    contaPoupanca.deposito(valor = 500.0)
    contaSalario.deposito(valor = 300.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta salário: ${contaSalario.saldo}")

    contaCorrente.saque(valor = 100.0)
    contaPoupanca.saque(valor = 100.0)
    contaSalario.saque(valor = 50.0)

    println("Saldo conta corrente após saque: ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: ${contaPoupanca.saldo}")
    println("Saldo conta salário após saque: ${contaSalario.saldo}")

    contaCorrente.transferencia(valor = 500.0, contaPoupanca)

    println("Saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transferencia(valor = 500.0, contaCorrente)

    println("Saldo conta poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo conta corrente após receber transferência: ${contaCorrente.saldo}")

    // contaSalario.transferencia(valor = 30.0, contaPoupanca)
}
