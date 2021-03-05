fun main() {
    println("Ola mundo!!!")
    val contaWalter = Conta()
    val contaMaria = Conta()
    contaMaria.titular = "Maria Clara"
    contaMaria.numero = 1000
    contaWalter.titular = "Walter Heitor"
    contaWalter.numero = 1002

    println("titular conta : ${contaWalter.titular}")
    contaWalter.deposita(2500.0)
    println("Depositando na conta o valor: ${contaWalter.saldo}")
    contaWalter.saca(378.96)
    println("sacando na conta o valor: ${contaWalter.saldo}")
    print("---------------------------------------------------")
    println("titular conta : ${contaMaria.titular}")
    contaMaria.deposita(7500.0)
    println("Depositando na conta o valor: ${contaMaria.saldo}")
    contaMaria.saca(1257.20)
    println("sacando na conta o valor: ${contaMaria.saldo}")

}

/**
 *
 */
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (valor <= saldo) this.saldo -= valor
    }
}