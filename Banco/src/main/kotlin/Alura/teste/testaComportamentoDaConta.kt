import Alura.cliente.Cliente
import Alura.conta.Conta
import Alura.conta.ContaCorrente
import Alura.conta.ContaPoupanca

fun testaComportamentoDaConta() {
    println("Ola mundo!!!")
    val walter = Cliente(nome = "walter", cpf = "111.111.111.11", senha = "123")
    val maria = Cliente("maria", "222.222.222.22", senha = "123")
    val contaWalter = ContaCorrente(walter, 1000)
    val contaMaria = ContaPoupanca(maria, 1002)
    contaMaria.deposita(-200.0)
    println("salto ${contaMaria.saldo}")
    contaWalter.deposita(205.53)


    println("titular conta : ${contaWalter.titular.nome}")
    contaWalter.deposita(2500.0)
    println("Depositando na conta o valor: ${contaWalter.saldo}")
    contaWalter.saca(378.96)
    println("sacando na conta o valor: ${contaWalter.saldo}")
    println("---------------------------------------------------")
    println("titular conta : ${contaMaria.titular.nome}")
    contaMaria.deposita(7500.0)
    println("Depositando na conta o valor: ${contaMaria.saldo}")
    contaMaria.saca(1257.20)
    println("sacando na conta o valor: ${contaMaria.saldo}")
    println("---------------------------------------------")
    println("Tranferencia da conta maria para walter")
    if (contaMaria.tranfere(297.04, contaWalter)) {
        println("Tranferencia sucedida!")
        println("conta o valor: ${contaWalter.saldo}")
    } else {
        println("Falha na ranferencia!")
    }
}