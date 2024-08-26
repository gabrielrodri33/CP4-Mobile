fun main() {
    ex1()
    ex2()
}

fun ex1() {
    println("-=-=-=-=-=-=-=-=-=-=-=-=Exercício 1-=-=-=-=-=-=-=-=-=-=-=-=")
  
    println("Valor do produto: ")
    var valorProduto = readLine()?.toDouble() ?: 0.0

    println("Porcentagem de desconto: ")
    var porcentagemDesconto = readLine()?.toDouble() ?: 0.0

    var valorFinal = valorProduto - (valorProduto * (porcentagemDesconto / 100))
    println("Valor do produto com $porcentagemDesconto% de desconto: R$$valorFinal")

    println("=-=-=-=-=-=-=-=-=-=-=Fim do exercício 1-=-=-=-=-=-=-=-=-=-=-")
}

fun ex2(){
    println("-=-=-=-=-=-=-=-=-=-=-=-=Exercício 2-=-=-=-=-=-=-=-=-=-=-=-=")

    var x: Double = 1.0
    var total: Double = 0.0

    while(x != 0.0){
        println("Digite um número para somar com: $total")
        x = readLine()?.toDouble() ?: 0.0
        total += x
    }
    println("Total: $total")
    println("=-=-=-=-=-=-=-=-=-=-=Fim do exercício 2-=-=-=-=-=-=-=-=-=-=-")
}