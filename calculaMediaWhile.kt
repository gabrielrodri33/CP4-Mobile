import java.util.*

fun main() {
    calcularMediaWhile()
}

fun calcularMediaWhile(){
    val scanner = Scanner(System.`in`)

    var cont = 0
    var total = 0.0
    var n = 1.0

    while (n > 0){
        println("Digite um valor: ")
        n = scanner.nextDouble()
        
        if (n > 0){
            total += n
            cont++
        }
    }

    var media = total / cont
    println("Contador: $cont")
    println("Total: $total")
    println("Média: $media")
}