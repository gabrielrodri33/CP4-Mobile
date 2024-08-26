class Livro(
    val titulo: String,
    val autor: String,
    val numeroPaginas: Int,
    val editora: String,
    val anoPublicacao: Int
) {
    // Podemos adicionar métodos aqui, como por exemplo:
    fun exibirDetalhes() {
        println("Título: $titulo")
        println("Autor: $autor")
        println("Número de páginas: $numeroPaginas")
        println("Editora: $editora")
        println("Ano de publicação: $anoPublicacao")
    }
}

fun main() {
    println("Digite o título do livro:")
    var titulo = readLine() ?: ""
    
    println("Digite o autor do livro:")
    var autor = readLine() ?: ""
    
    println("Digite o número de páginas do livro:")
    var numeroPaginas = readLine()?.toInt() ?: 0
    
    println("Digite a editora do livro:")
    var editora = readLine() ?: ""

    println("Digite o ano de publicação do livro:")
    var anoPublicacao = readLine()?.toInt() ?: 0

    val livro1 = Livro(titulo, autor, numeroPaginas, editora, anoPublicacao)
    livro1.exibirDetalhes()
}