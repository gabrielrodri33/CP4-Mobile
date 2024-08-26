import java.util.*

fun main() {
    ex1()
    ex2()
}

fun ex1() {
    println("-=-=-=-=-=-=-=-=-=-=-=-=Exercício 1-=-=-=-=-=-=-=-=-=-=-=-=")
    val scanner = Scanner(System.`in`)
  
    println("Valor do produto: ")
    var valorProduto = scanner.nextDouble()

    println("Porcentagem de desconto: ")
    var porcentagemDesconto = scanner.nextDouble()

    var valorFinal = valorProduto - (valorProduto * (porcentagemDesconto / 100))
    println("Valor do produto com $porcentagemDesconto% de desconto: R$$valorFinal")

    println("=-=-=-=-=-=-=-=-=-=-=Fim do exercício 1-=-=-=-=-=-=-=-=-=-=-")
}

fun ex2(){
    println("-=-=-=-=-=-=-=-=-=-=-=-=Exercício 2-=-=-=-=-=-=-=-=-=-=-=-=")
    val scanner = Scanner(System.`in`)

    var x: Double = 1.0
    var total: Double = 0.0

    while(x != 0.0){
        println("Digite um número para somar com: $total")
        x = scanner.nextDouble()
        total += x
    }
    println("=-=-=-=-=-=-=-=-=-=-=Fim do exercício 2-=-=-=-=-=-=-=-=-=-=-")
}