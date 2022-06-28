package one.digitalinnovaction.collections

fun main() {
    val lucas = Funcionario(nome = "Lucas", salario = 1000.0, tipoContratacao = "CLT")
    val ingrid = Funcionario(nome = "Ingrid", salario = 2000.0, tipoContratacao = "PJ")
    val erica = Funcionario(nome = "Erica", salario = 4000.0, tipoContratacao = "CLT")

    println("---------LIST-----------")
    val funcionarios = mutableListOf(lucas, erica)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.add(ingrid)
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.remove(lucas)
    funcionarios.forEach { println(it) }

    println("---------SET-----------")
    val funcionarioSet = mutableSetOf(lucas)

    println("---------------------")
    funcionarioSet.add(ingrid)
    funcionarioSet.add(erica)
    funcionarioSet.forEach { println(it) }

    println("---------------------")
    funcionarioSet.remove(erica)
    funcionarioSet.forEach { println(it) }





}