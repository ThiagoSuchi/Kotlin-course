fun main(args: Array<String>) {

    // List
    val listaDeNomes = listOf("Thiago", "Dandára", "George") // listOf(...) é imutável por padrão
    // OBS: Mesmo se você usar var, a lista ainda será imutável se você usar listOf(). A diferença entre val e var nesse caso é apenas a referência da variável, e não o conteúdo da lista.

    val listaDeNomes2 = mutableListOf("Luan", "Larissa", "Clara", "Ana", "Tadeo")// mutableListOf() é uma função que cria um array mutavel.
    listaDeNomes2.add("Flávia")// adciona um elemento
    listaDeNomes2[2] = "Douglas"// passa um novo valor para o elemento específicado no array

    listaDeNomes2.removeFirst()// remove o primeiro elemento
    listaDeNomes2.removeLast()// remove o último elemento
    listaDeNomes2.removeAt(2 )// remove um elemento apartir do index passado

    println(listaDeNomes2)
    println(listaDeNomes)


    // Set
    // OBS: No set não há index, É usado quando você quer verificar existência, não posição, Não garante ordem dos elementos,
    val setDeCPFs = setOf("111", "111", "222", "333")// Se o elemento se repetir ele ignora, pois cada valor é único
    println(setDeCPFs)

    val setDeCPFs2 = mutableSetOf("111", "222", "333")
    setDeCPFs2.add("444")
    setDeCPFs2.remove("222")
    println(setDeCPFs2)


    // Map
    // OBS: Buscar dados por chave em vez de por índice. Modelar coisas como: usuários, produtos com códigos, nomes com idade, etc.
    val exemploDeMap = mapOf( // É uma coleção de pares chave-valor, tipo um objeto ou dicionário.
        "Nome" to "Lauran",
        "Idade" to 22,
        "Sexo" to "Feminino"
    )
    println(exemploDeMap["Nome"])

}