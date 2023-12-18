//O programa recebe a média de um aluno e imprime se ele está de recuperação, reprovado ou aprovado.
//Caso a média seja < 5 imprima "REP";
//Caso a média seja >= 5 e < 7 imprima "REC";
//Caso a média seja >7 imprima "APR".

fun main() {
    println("Digite a média:")
    val media: Double? = readLine()?.toDoubleOrNull()

    media?.let {
        println("Média fornecida: $it")

            when {
                it < 5.0 -> println("REP")
                it >= 5.0 && it < 7.0 -> println("REC")
                else -> println("APR")
            }
        }?: println("Valor inválido para média.")
    }

