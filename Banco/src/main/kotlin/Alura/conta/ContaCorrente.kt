package Alura.conta

import Alura.cliente.Cliente

class ContaCorrente(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorTaxa = valor + 0.1
        if(this.saldo >= valorTaxa){
            this.saldo -= valorTaxa
        }
    }
}