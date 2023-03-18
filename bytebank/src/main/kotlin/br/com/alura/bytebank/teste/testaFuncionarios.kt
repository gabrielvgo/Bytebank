package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val gabriel = Analista(
        nome = "Gabriel",
        cpf = "222.222.222-22",
        salario = 1000.0
    )

    println("Nome do funcionário: ${gabriel.nome}")
    println("CPF do funcionário: ${gabriel.cpf}")
    println("Salário do funcionário: ${gabriel.salario}")
    println("Salário com a bonificação do funcionário: ${gabriel.bonificacao}")

    val sonia = Gerente(
        nome = "Sônia",
        cpf = "000.000..000-00",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome do funcionário: ${sonia.nome}")
    println("CPF do funcionário: ${sonia.cpf}")
    println("Salário do funcionário: ${sonia.salario}")
    println("Salário com a bonificação do funcionário: ${sonia.bonificacao}")

    if (sonia.autentica(senha = 1234)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("Autenticação não realizada!")
    }

    val flavio = Diretor(
        nome = "Flavio",
        cpf = "111.111.111-11",
        salario = 3000.0,
        senha = 5678,
        plr = 200.0
    )

    println("Nome do funcionário: ${flavio.nome}")
    println("CPF do funcionário: ${flavio.cpf}")
    println("Salário do funcionário: ${flavio.salario}")
    println("Salário com a bonificação do funcionário: ${flavio.bonificacao}")
    println("PLR do funcionário: ${flavio.plr}")

    if (flavio.autentica(senha = 5678)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("Autenticação não realizada!")
    }

    val maria = Analista(nome = "Maria", cpf = "333.333.333-33", salario = 2500.0)

    println("Nome do funcionário: ${maria.nome}")
    println("CPF do funcionário: ${maria.cpf}")
    println("Salário do funcionário: ${maria.salario}")
    println("Salário com a bonificação do funcionário: ${maria.bonificacao}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gabriel)
    calculadora.registra(sonia)
    calculadora.registra(flavio)
    calculadora.registra(maria)

    println("Total bonificação: ${calculadora.total}")
}