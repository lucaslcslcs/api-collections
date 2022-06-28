package one.digitalinnovaction.collections

fun main() {
    val lucas = Funcionario(nome = "Lucas", salario = 1000.0, tipoContratacao = "CLT")
    val ingrid = Funcionario(nome = "Ingrid", salario = 2000.0, tipoContratacao = "PJ")
    val erica = Funcionario(nome = "Erica", salario = 4000.0, tipoContratacao = "CLT")

    val funcionario1 = listOf(lucas, ingrid)
    val funcionario2 = listOf(erica)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach { println(it) }

    println("---------------------")
    val funcionario3 = setOf(lucas, ingrid, erica)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach { println(it) }

    println("---------------------")
    val funcionario4 = setOf(lucas, ingrid, erica)
    val resultIntersect = funcionario4.intersect(funcionario2)
    resultIntersect.forEach { println(it) }

}