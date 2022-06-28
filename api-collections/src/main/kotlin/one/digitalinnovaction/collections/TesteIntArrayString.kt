package one.digitalinnovaction.collections

fun main(){
    val nomes = Array<String>(3) {""}
    nomes[0] = "Lucas"
    nomes[1] = "Ingrid"
    nomes[2] = "Erica"

    println("---------------------")
    for (nome in nomes){
        println(nome)
    }

    println("---------------------")

    nomes.sort()
    nomes.forEach { println(it) }

    println("---------------------")
    val nomes2 = arrayOf("Lucas", "Ingrid", "Erica")
    nomes2.sort()
    nomes2.forEach { println(it) }
}