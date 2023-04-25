package br.com.alura.bytebank.modelo

class ContaPoupanca(
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