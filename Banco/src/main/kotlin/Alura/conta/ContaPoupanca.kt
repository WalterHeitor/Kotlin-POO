package Alura.conta

import Alura.cliente.Cliente

class ContaPoupanca(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor
        }
    }
}