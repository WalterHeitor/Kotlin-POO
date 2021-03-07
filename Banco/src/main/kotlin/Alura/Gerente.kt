package Alura

class Gerente (
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
        ) : Funcionario(nome = nome, cpf = cpf, salario = salario){


    fun autentica(){

    }
}