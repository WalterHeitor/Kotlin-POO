package Alura.Funcionario

class Diretor (
    nome: String,
    cpf: String,
    salario: Double,
    val plr: Double,
    val senha: String
        ) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override val bonificacao: Double
        get() {
            println("Bonificacao Diretor")
            return super.bonificacao + salario + plr
        }

    fun autentica(senha: String): Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}