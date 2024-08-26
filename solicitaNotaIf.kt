fun main() {
    avaliaResultadoIf()
}

fun avaliaResultadoIf(){
    println("Digite uma nota entre 1 e 5")
    var nota = readLine()?.toInt()

    if (nota == 1){
        println("Péssimo")
    } else if (nota == 2){
        println("Ruim")
    } else if (nota == 3){
        println("Satisfatório")
    } else if (nota == 4){
        println("Bom")
    } else if(nota == 5){
        println("Ótimo")
    } else {
        println("Nota inválida")
    }
}