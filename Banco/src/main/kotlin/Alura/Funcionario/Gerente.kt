package Alura.Funcionario

class Gerente (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
        ) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() {
            println("Bonificacao Gerente")
            return super.bonificacao + salario
        }

    fun autentica(senha: String): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}