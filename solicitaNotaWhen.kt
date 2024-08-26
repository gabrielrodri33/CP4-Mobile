import java.util.*

fun main() {
    avaliaResultadoWhen()
}

fun avaliaResultadoWhen(){
    val scanner = Scanner(System.`in`)

    println("Digite uma nota entre 1 e 5")
    var nota = scanner.nextInt()

    when(nota){
        1-> println("Péssimo")
        2-> println("Ruim")
        3-> println("Satisfatório")
        4-> println("Bom")
        5-> println("Ótimo")
        else -> println("Nota inválida")
    } 
}