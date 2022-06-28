package one.digitalinnovaction.collections

fun main(){
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    println("---------------------")
    values.forEach {
        println(it)
    }

    println("---------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}