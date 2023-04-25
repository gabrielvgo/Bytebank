package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

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