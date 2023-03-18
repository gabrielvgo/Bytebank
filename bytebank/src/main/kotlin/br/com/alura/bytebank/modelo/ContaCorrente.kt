package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: String,
    numeroConta: Int
) : ContaTransferivel(
    titular = titular,
    numeroConta = numeroConta
){
    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
        }
    }
}