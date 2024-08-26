open class Animal(val nome: String, val idade: Int) {
    open fun emitirSom() {
        println("Som genérico de um animal")
    }
}

class Cachorro(nome: String, idade: Int, val raca: String) : Animal(nome, idade) {
    override fun emitirSom() {
        println("Au au!")
    }
}

class Gato(nome: String, idade: Int, val cor: String) : Animal(nome, idade) {
    override fun emitirSom() {
        println("Miau!")
    }
}

fun main() {
    // Criando objetos da classe Cachorro
    val cachorro1 = Cachorro("Rex", 3, "Labrador")
    val cachorro2 = Cachorro("Bella", 2, "Golden Retriever")
    val cachorro3 = Cachorro("Spike", 5, "Pitbull")

    // Criando objetos da classe Gato
    val gato1 = Gato("Mia", 2, "Branco")
    val gato2 = Gato("Tom", 4, "Cinza")
    val gato3 = Gato("Luna", 1, "Malhado")

    // Exibindo informações dos cachorros
    println("Cachorros:")
    cachorro1.emitirSom()
    println("Nome: ${cachorro1.nome}, Idade: ${cachorro1.idade}, Raça: ${cachorro1.raca}")
    cachorro2.emitirSom()
    println("Nome: ${cachorro2.nome}, Idade: ${cachorro2.idade}, Raça: ${cachorro2.raca}")
    cachorro3.emitirSom()
    println("Nome: ${cachorro3.nome}, Idade: ${cachorro3.idade}, Raça: ${cachorro3.raca}")

    // Exibindo informações dos gatos
    println("\nGatos:")
    gato1.emitirSom()
    println("Nome: ${gato1.nome}, Idade: ${gato1.idade}, Cor: ${gato1.nome}")
    gato2.emitirSom()
    println("Nome: ${gato2.nome}, Idade: ${gato2.idade}, Cor: ${gato2.nome}")
    gato3.emitirSom()
    println("Nome: ${gato3.nome}, Idade: ${gato3.idade}, Cor: ${gato3.nome}")
}