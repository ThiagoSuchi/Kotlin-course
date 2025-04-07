fun main(args: Array<String>) {
    val instaciaDeCarro = Carro(
        marca = "Gol",
        modelo = "Fusca",
        ano = 2021,
        kmRodados = 300000
    )

    println(instaciaDeCarro.kmRodados)
    instaciaDeCarro.acelerar()
    print(instaciaDeCarro.kmRodados)
}

open class Carro (val marca: String, protected val modelo: String, private val ano: Int, var kmRodados: Int) {
    fun acelerar() {
        println("Acelerando o $modelo")
        kmRodados += 10
    }
}