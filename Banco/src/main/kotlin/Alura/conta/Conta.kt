package Alura.conta

import Alura.cliente.Cliente

/**
 *
 */
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    open fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    abstract fun saca(valor: Double)

    fun tranfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}