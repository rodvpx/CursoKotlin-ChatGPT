package modulo03

fun main() {
    //### **Exercício 1: Trabalhando com Listas**
//Crie uma lista de números inteiros e use a função `filter`
// para criar uma nova lista contendo apenas os números pares.

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numbers.filter { it % 2 == 0 }
    pares.forEach { print("$it,") }
//### **Exercício 2: Manipulação de Strings**
//Crie uma função que receba uma string, remova os
// espaços em branco no início e no fim, e substitua
// todas as ocorrências da palavra "ruim" por "boa".
    val texto: String = "\n  Um texto aleatorio, sobre ser ruim, " +
            "eu sou ruim em tudo, muito ruim serio menina credo    "
    println(texto)
    println(trocaTexto(texto))
//### **Exercício 3: Mapas e Funções**
//Crie um mapa que contenha o nome de várias pessoas e s
// uas idades. Use a função `filter` para encontrar todas
// as pessoas com mais de 18 anos e imprima o nome delas.

    val pessoas = mapOf(
        "Ana" to 25,
        "João" to 17,
        "Carlos" to 19,
        "Maria" to 16,
        "Fernanda" to 22
    )

    val maiores = pessoas.filter { it.value > 18 }.keys
    println(maiores)

//    val maioresDeIdade = pessoas.filter { (_, idade) -> idade > 18 }
//
//    // Imprimindo o nome das pessoas maiores de 18 anos
//    maioresDeIdade.forEach { (nome, _) ->
//        println(nome)
//}

}

    fun trocaTexto(txt: String): String {
        val newTexto = txt.trim().replace("ruim", "boa")
        return newTexto
    }