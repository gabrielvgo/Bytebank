package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
) {
    var saldo = 0.0
        protected set

    fun deposito(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saque(valor: Double)
}