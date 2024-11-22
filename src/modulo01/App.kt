package modulo01

fun main(args: Array<String>) {

    var nome = "Ana" //variavel mutavel
    println(nome)
    nome = "Maria"
    println(nome)

    val idades = 25 //variavel imutavel

    //Tipos de dados
    val numbrs: Int = 45
    val quebrado: Double = 3.14
    val vouf: Boolean = false
    val texto: String = "Um texto"
    val caracter: Char = 'A'

    //interpolação
    val nombre: String = "Ricardão"
    val idade: Int = 21
    println("Seu nome é $nome e tens $idade anos")

    //operadores
    val a: Int = 10
    val b: Int = 20

    println("Soma: ${a + b}")
    println("Subtração: ${b - a}")
    println("Multiplicação: ${b * a}")
    println("Divisão: ${b / a}")
    println("Resto Divisaõ: ${b % a}")

    //operações relacionais
    val x: Int = 5
    val y: Int = 8
    println("x: $x, y: $y")
    println("Maior: ${x > y}")
    println("Menor: ${x < y}")
    println("Igual: ${x == y}")
    println("Diferente: ${x != y}")

    //opreradores logicos
    val ativo: Boolean = true
    val administrador: Boolean = false

    println("Ativo: $ativo, Administrador: $administrador")
    println("E: ${ativo && administrador}")
    println("Ou: ${ativo || administrador}")
    println("Não: ${!ativo}")


}