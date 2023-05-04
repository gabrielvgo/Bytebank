package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Gabriel",
            cpf = "666.666.666-66",
            senha = 5,
            endereco = Endereco(
                logradouro = "Rua Simão Tamm"
            )
        ),
        numeroConta = 2001
    )

    println("Titular ${contaCorrente.titular}")
    println("Nome do titular: ${contaCorrente.titular.nome}")
    println("Cpf do titular: ${contaCorrente.titular.cpf}")
    println("Endereço do titular: ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Sônia",
            cpf = "",
            senha = 6
        ),
        numeroConta = 2002
    )

    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Filipe",
            cpf = "",
            senha = 7
        ),
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

    contaCorrente.transferencia(valor = 500.0, contaPoupanca, senha = 2)

    println("Saldo conta corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transferencia(valor = 500.0, contaCorrente, senha = 1)

    println("Saldo conta poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo conta corrente após receber transferência: ${contaCorrente.saldo}")

    // contaSalario.transferencia(valor = 30.0, contaPoupanca)
}
