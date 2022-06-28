package one.digitalinnovaction.collections

fun main() {
    val lucas = Funcionario(nome = "Lucas", salario = 1000.0, tipoContratacao = "CLT")
    val ingrid = Funcionario(nome = "Ingrid", salario = 2000.0, tipoContratacao = "PJ")
    val erica = Funcionario(nome = "Erica", salario = 4000.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(lucas.nome, lucas)
    repositorio.create(ingrid.nome, ingrid)
    repositorio.create(erica.nome, erica)

    println(repositorio.findById(lucas.nome))

    println("---------------------")
    repositorio.findAll().forEach { println(it) }

    println("---------------------")
    repositorio.remove(lucas.nome)
    repositorio.findAll().forEach { println(it) }

}