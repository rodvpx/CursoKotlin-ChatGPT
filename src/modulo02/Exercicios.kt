package modulo02

fun main() {
    //### **Exercício 1: Condicionais - Verificação de maioridade**
//Escreva um programa que leia a idade de uma pessoa e verifique se
// ela é maior de idade (18 anos ou mais) ou menor de idade (
// menos de 18 anos).

    val idade = 101
    if(idade < 16 || idade in 61..100){
        println("Menor de idade ou incapaz")
    } else if(idade in 16..17){
        println("Menor de idade, porem responde por seus crimes")
    } else if (idade in 18..60){
        println("maior de idade")
    } else {
        println("Idade invalida")
    }

//### **Exercício 2: Laços de Repetição - Contagem regressiva**
//Implemente um programa que exiba uma contagem regressiva de 10 até 1,
// usando um laço `for`.

    for (i in 10 downTo 1){
        println(i)
    }
//### **Exercício 3: Funções - Cálculo de área do triângulo**
//Crie uma função que receba a base e a altura de um triângulo
// e retorne a área. A fórmula da área é: `área = (base * altura) / 2`.
    val base: Double = 20.9
    val altura: Double = 15.56

    println(calcularAreaTriangulo(base, altura))
}

fun calcularAreaTriangulo(base: Double, altura: Double): Double {
//    val area: Double = (base * altura - base) / 2
//    return area
    //ou
    return (base * altura - base) / 2
}
