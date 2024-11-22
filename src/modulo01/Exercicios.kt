package modulo01

fun main(args: Array<String>) {

    //1) 1. **Escreva um programa que exiba sua apresentação**:
    //    - Exemplo de saída: `"Meu nome é Ana, tenho 22 anos e gosto de programação."`
    println("1)")
    val nome: String = "Rodrigo"
    val idade: Int = 23
    val robe: String = "Eu gosto de fazer programa rsrs"

    println("Meu nome é $nome, tenho $idade anos \ne como robe $robe")

    //2) Crie um programa que some dois números e exiba o resultado.
    println("2)")
    val num1: Int = 25
    val num2: Int = 25
    val result: Int = num1 + num2

    println("A soma de 2 números")
    println("Sendo: $num1 + $num2 = $result")

    //Declare duas variáveis do tipo Int e compare-as com
    // operadores relacionais.
    println("3)")

    val n1: Int = 25
    val n2: Int = 26

    println("""
        Os números $n1 e $n2 são:
        $n1 é maior que $n2: ${n1 > n2}
        $n1 é menor que $n2: ${n1 < n2}
        $n1 e $n2 são iguais: ${n1 == n2}
        $n1 é $n2 são diferentes: ${n1 != n2}
        
    """.trimIndent())

    //4. **Teste operadores lógicos**:
    //    - Declare duas variáveis booleanas e combine-as usando `&&`, `||` e `!`.
   println("4)")
    val manha: Boolean = true
    val tarde: Boolean = true
    val noite: Boolean = false

    println("""
        Manhã: $manha, Tarde: $tarde, Noite: $noite
        Usando o ou com tarde e noite: ${tarde || noite}
        Usando o e com manhã e noite: ${manha && noite}
        Usando o ou e o e com manha, tarde e noite: ${(manha || tarde) && noite}
        
    """.trimIndent())

}