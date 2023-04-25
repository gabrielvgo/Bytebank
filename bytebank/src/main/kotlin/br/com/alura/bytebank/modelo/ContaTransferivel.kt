package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

abstract class ContaTransferivel (
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
){
    fun transferencia(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposito(valor)
            return true
        }
        return false
    }
}