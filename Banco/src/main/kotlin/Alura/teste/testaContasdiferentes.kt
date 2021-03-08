package Alura.teste

import Alura.conta.ContaCorrente
import Alura.conta.ContaPoupanca

class testaContasdiferentes {
    fun testaContasdiferentes() {
        val contaCorrente = ContaCorrente(
            titular = "walter",
            numero = 1000
        )
        val contaPoupanca = ContaPoupanca(
            titular = "Maria",
            numero = 1100
        )

        contaCorrente.deposita(1000.0)
        contaPoupanca.deposita(1000.0)

        println("contaCorrente ${contaCorrente.saldo}")
        println("contaPoupanca ${contaPoupanca.saldo}")
        println("-------------------------------------")

        contaCorrente.saca(100.0)
        contaPoupanca.saca(100.0)

        println("contaCorrente apos saque ${contaCorrente.saldo}")
        println("contaPoupanca apos saque ${contaPoupanca.saldo}")
        println("-------------------------------------")

        contaCorrente.tranfere(100.0, contaPoupanca)
        println("contaCorrente apos transferir para poupanca ${contaCorrente.saldo}")
        println("contaPoupanca apos receber tranferencia ${contaPoupanca.saldo}")
        println("-------------------------------------")

        contaPoupanca.tranfere(100.0, contaCorrente)
        println("contaPoupanca apos transferir para poupanca ${contaPoupanca.saldo}")
        println("contaCorrente apos receber tranferencia ${contaCorrente.saldo}")
        println("-------------------------------------")
    }
}