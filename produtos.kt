fun main() {
    fazerLoop()
}

fun fazerLoop(){
    val produtos = mutableMapOf<String, Double>()

    var continuar = true
    while (continuar) {
        println("Digite o nome do produto (ou 'sair' para encerrar):")
        val nome = readLine() ?: ""

        if (nome.lowercase() == "sair") {
            continuar = false
        } else {
            println("Digite o preço do produto:")
            val preco = readLine()?.toDoubleOrNull() ?: 0.0
            produtos[nome] = preco
        }
    }

    println("\nProdutos cadastrados:")
    for ((nome, preco) in produtos) {
        println("$nome - R$ $preco")
    }

    var somaPrecos = 0.0
    var quantidade = 0
    for (preco in produtos.values) {
        somaPrecos += preco
        quantidade++
    }
    val media = somaPrecos / quantidade
    println("\nMédia dos preços: R$ $media")

    val produtosOrdenados = produtos.toList().sortedBy { (_, preco) -> preco }
    println("\nProdutos ordenados por preço:")
    for ((nome, preco) in produtosOrdenados) {
        println("$nome - R$ $preco")
    }
}