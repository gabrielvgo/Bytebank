package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: String,
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