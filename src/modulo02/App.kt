package modulo02

fun main(args: Array<String>) {

//    //condições if e else
//    val idade: Int = 20
//
//    if (idade >= 18) {
//        println("Maior de idade")
//    } else {
//        println("Menor de idade")
//    }
//
//    //uso do when, semelhante o switch case do java
//    val option: Int = 0
//    when (option) {
//        1 -> println("Usuarios")
//        2 -> println("Registros")
//        3 -> println("Venda")
//        else -> println("Escolha uma opção valida")
//    }

    //laços de repetição

//    for (i in 1..5) {//percorre de 1 a 5, .. para intervalo
//        println(i)
//    }

    //while
//    var contador: Int = 0
////    while (contador < 5) {
////        println(contador)
////        contador++
////    }
//
//    //do while
//    do {
//        println(contador)
//        contador++
//
//    } while (contador != 5)

    //função
    println(soma(25, 45)) //chamando a função
    println(desconto(preco = 100.0, desconto = 0.2)) //parametros nomeados
}
//função
fun soma(x: Int, y: Int): Int {
    return x + y
}

fun desconto(preco: Double, desconto: Double = 0.0): Double {
    return preco - (preco * desconto)
}
