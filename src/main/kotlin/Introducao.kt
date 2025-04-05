fun main( args: Array<String>) {
    val nome = "Luana";// Variável com o tipo string
    var idade = 22;// Constante com o tipo INT
    val primeiraNota = 8.5f;// Isso é do tipo Float
    var segundoNota = 6.6; // Tipo Duble
    val terceiraNota = 9 // Tipo INT
    val notaParaPassar = 7
    val foiAprovado = true; // Isso é do tipo Boolean
    val letra = "D"; // Isso é um tipo Char

    println("Exemplo de soma: ${primeiraNota + segundoNota}")
    println("Exemplo de subtração: ${primeiraNota - segundoNota}")
    println("Exemplo de multiplicação: ${primeiraNota * segundoNota}")
    println("Exemplo de divisão: ${primeiraNota / segundoNota}")
    println("Exemplo de resto da divisão: ${terceiraNota % terceiraNota}")

    fun calculaMedia(): Float {
        val soma = primeiraNota + terceiraNota
        val media = soma / 2
        return media
    }

    fun alunoPassouDeAno(): String {
        val media = calculaMedia()
        val passouDeAno = media >= notaParaPassar
        return if (passouDeAno) {
            "O aluno(a) foi aprovado!"
        } else {
            "O aluno(a) foi reprovado"
        }
    }

    println("A média é: ${calculaMedia()}")
    println("Status do aluno: ${alunoPassouDeAno()}")
}