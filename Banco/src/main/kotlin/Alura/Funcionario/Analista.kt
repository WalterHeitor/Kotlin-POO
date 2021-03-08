package Alura.Funcionario

class Analista (
    nome: String,
    cpf: String,
    salario: Double,
        ) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() {
            println("Bonificacao Analista")
            return super.bonificacao + salario * 0.1
        }

}