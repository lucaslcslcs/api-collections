package one.digitalinnovaction.collections

fun main() {
    val lucas = Funcionario(nome = "Lucas", salario = 1000.0, tipoContratacao = "CLT")
    val ingrid = Funcionario(nome = "Ingrid", salario = 2000.0, tipoContratacao = "PJ")
    val erica = Funcionario(nome = "Erica", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(lucas, ingrid, erica)

    funcionarios.forEach { println(it) }

    println("---------------------")
    println(funcionarios.find { it.nome == "Ingrid"} )

    println("---------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}