package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacao
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
): Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Nova conta criada!")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposito(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saque(valor: Double)
}

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : ContaTransferivel(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saque(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : ContaTransferivel(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaSalario(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saque(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }
}

abstract class ContaTransferivel(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    fun transferencia(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "Falha na transferência, saldo atual: $saldo. Valos da transferência: $valor"
            )
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacao()
        }
//        throw NumberFormatException()
        saldo -= valor
        destino.deposito(valor)
    }
}