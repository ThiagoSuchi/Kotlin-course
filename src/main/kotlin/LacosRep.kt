// Laços de repetição

fun main(args: Array<String>) {

    val listaDeNomes = listOf("Luanda", "Martina", "Caua", "Anderson")
    for (nome in listaDeNomes) {
        println(nome)
    }

    println("------------------------------------")

    // O it dentro de um forEach representa o elemento atual da iteração.
    listaDeNomes.forEach {
        println(it)
    }
    // OUU PASSAUM PARÂMETRO PARA SER MAIS ESPECÍFICO
    listaDeNomes.forEach { nome ->
        println(nome)
    }
    // Definindo um range para o forEach fazer oque for passado
    (0..listaDeNomes.size - 1).forEach {
        println(">>${listaDeNomes[it]}<<")
    }

    println("------------------------------------")

    // step é o “tamanho do pulo” que o loop vai dar a cada volta.
    for (i in 0..10 step 2) {
        println(i)
    }
    // O downTo conta de trás para frente,  e pode ser combinado com step para definir saltos.
    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    println("------------------------------------")

    // WHILE
    var numA = 10
    val numB = 20

    while (numA <= numB) {
        println(numA)
        numA += 1
    }
}