package Alura

fun main() {

    val walter = Funcionario(
        nome = "Walter heitor",
        cpf = "111.111.111.11",
        salario = 2500.0,
        tipo = 1
    )

    println("nome ${walter.nome}")
    println("cpf ${walter.cpf}")
    println("salario ${walter.salario}")
    println("bonificação ${walter.bonificacao()}")

}



