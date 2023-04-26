package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaObjects() {
    val champs = object : Autenticavel {
        val nome: String = "Champs"
        val cpf: String = "199.999.999-99"
        val senha: Int = 1234

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(champs, senha = 1234)

    val contaHenrique = ContaPoupanca(
        Cliente(
            nome = "Henrique",
            cpf = "000.000.000-00",
            senha = 2702
        ), numeroConta = 4567
    )

    val contaFernando = ContaCorrente(
        Cliente(
            nome = "Fernando",
            cpf = "111.111.111-11",
            senha = 9087
        ), numeroConta = 8901
    )

    println("Total de contas criadas: ${Conta.total}")

}