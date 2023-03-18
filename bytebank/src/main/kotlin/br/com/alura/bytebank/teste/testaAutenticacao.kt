package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {

    val gerente = Gerente(
        nome = "Gabriel",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretora = Diretor(
        nome = "Sônia",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Flávio",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, senha = 1000)
    sistema.entra(diretora, senha = 2000)
    sistema.entra(cliente, senha = 1234)

}
