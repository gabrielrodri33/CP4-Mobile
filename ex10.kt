fun saudacao(nome: String): String {
    return "Olá, $nome! Seja bem-vindo."
}

fun main() {
    val nomeUsuario = "Fernando"
    val mensagem = saudacao(nomeUsuario)
    println(mensagem)
}