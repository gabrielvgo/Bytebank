package br.com.alura.bytebank.teste

fun testaLacos() {

    var i = 0
    while (i < 5) {
        val titular: String = "Gabriel $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {
        val titular: String = "Gabriel $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo $saldo")
        println()
    }
}