package br.com.alura.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "Saldo é insuficiente") : Exception(mensagem)