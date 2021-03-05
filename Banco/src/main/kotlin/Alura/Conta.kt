package Alura

/**
 *
 */
class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    fun saca(valor: Double) {
        if (valor <= saldo) this.saldo -= valor
    }

    fun tranfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}