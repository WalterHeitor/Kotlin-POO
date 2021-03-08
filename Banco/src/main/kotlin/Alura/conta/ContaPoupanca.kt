package Alura.conta

class ContaPoupanca(
    titular: String,
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