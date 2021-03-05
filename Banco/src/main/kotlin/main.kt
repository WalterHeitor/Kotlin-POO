fun main() {
    println("Ola mundo!!!")
    val contaWalter = Conta()
    val contaMaria = Conta()
    contaMaria.titular = "Maria Clara"
    contaMaria.numero = 1000
    contaMaria.saldo = -200.0
    println("salto ${contaMaria.saldo}")
    contaWalter.titular = "Walter Heitor"
    contaWalter.saldo = 205.53
    contaWalter.numero = 1002

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
    if(contaMaria.tranferre(297.04, contaWalter)){
        println("Tranferencia sucedida!")
        println("conta o valor: ${contaWalter.saldo}")
    }else{
        println("Falha na ranferencia!")
    }

}

/**
 *
 */
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
    set(valor){
        if(valor > 0) field = valor
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (valor <= saldo) this.saldo -= valor
    }

    fun tranferre(valor: Double, destino: Conta): Boolean {
        if(saldo >= valor){
            saldo -=valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}