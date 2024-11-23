package modulo03

fun main(args: Array<String>) {

    val lista = listOf("Diana", "Ana", "Marli", "Denifer")
    println(lista[3])

    val listaMutavel = mutableListOf("Ricardo", "Arthur", "Vinicius", "Gabriel")
    println(listaMutavel)
    listaMutavel.add("Marcos")
    println(listaMutavel)

    val conjunto = setOf(1, 2, 3, 4, 5, 6) //não permite elementos duplicados
    println(conjunto)

    val mapa = mapOf("nome" to "Ricardo", "idade" to 20)
    println(mapa["nome"])

    val numeros = listOf(1, 2, 3, 4, 5, 6)
    val pares = numeros.filter{it % 2 == 0}
    println(pares)
    val quadrados = numeros.map {it * it}
    println(quadrados)

    val frutas = listOf("Banana", "Cereja", "Manga")
    frutas.forEach { println(it) }

    val soma = listOf(1, 2, 3, 4).reduce{acc, i -> acc + i}
    println(soma)

}