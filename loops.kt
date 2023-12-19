fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado = 0

   // TODO("Criar uma variável mutável para armazenar o $resultado")
    if (!numeroRomano.isNullOrBlank()) {
        var i = 0
        while (i < numeroRomano.length) {
            val atual = numerosRomanos[numeroRomano[i]] ?: 0 // Valor atual em romano

            if (i + 1 < numeroRomano.length) {
                val proximo = numerosRomanos[numeroRomano[i + 1]] ?: 0 // Próximo valor em romano

                // Verifica se o próximo valor é maior ou igual ao atual
                if (proximo > atual) {
                    resultado += proximo - atual // Caso o próximo seja maior, subtrai o valor atual
                    i += 2 // Pula dois caracteres (o valor atual e o próximo)
                } else {
                    resultado += atual // Caso contrário, adiciona o valor atual ao resultado
                    i++ // Avança para o próximo caractere
                }
            } else {
                resultado += atual // Se não houver próximo caractere, adiciona o valor atual ao resultado
                i++ // Avança para o próximo caractere
            }
        }
    }
    println(resultado)
}