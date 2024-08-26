fun main(){
    fazerLoop()   
}

fun fazerLoop() {
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull() ?: 0

    if (numero > 0) {
        for (i in 2..numero step 2) {
            println(i)
        }
    } else {
        println("Número inválido. Por favor, digite um número positivo.")
    }
}