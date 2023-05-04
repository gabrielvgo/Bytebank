package br.com.alura.bytebank.exception

class FalhaAutenticacao(
    mensagem: String = "Falha na autenticação") : Exception(mensagem) {
}