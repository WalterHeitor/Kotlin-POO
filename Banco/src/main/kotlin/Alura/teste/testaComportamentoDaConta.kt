import Alura.conta.Conta

fun testaComportamentoDaConta() {
    println("Ola mundo!!!")
    val contaWalter = Conta("Walter Heitor", 1000)
    val contaMaria = Conta("Maria Clara", 1002)
    contaMaria.deposita(-200.0)
    println("salto ${contaMaria.saldo}")
    contaWalter.deposita(205.53)


    println("titular conta : ${contaWalter.titular}")
    contaWalter.deposita(2500.0)
    println("Depositando na conta o valor: ${contaWalter.saldo}")
    contaWalter.saca(378.96)
    println("sacando na conta o valor: ${contaWalter.saldo}")
    println("---------------------------------------------------")
    println("titular conta : ${contaMaria.titular}")
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