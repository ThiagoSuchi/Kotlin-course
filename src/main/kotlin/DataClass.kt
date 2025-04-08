fun main(args: Array<String>) {

    // Null Safety
    val student1 = Student("Roberta", 25, "Silva", nota = 9)

    // Safe call O plus(1) é um método que soma ou adiciona um valor a outro. No geral x.plus(1) é a mesma coisa que x + 1
    println(student1.nota?.plus(1))

    // Elvis operator Se o valor recebido for null ele recebe por padrão '0'
    println(student1.nota?.plus(1) ?: 0)

    // Safe cast
    val value1 = student1 as? Exemplo
    // 'as?' - Converter um valor para outro tipo sem causar erro. Se a conversão não for possível, em vez de lançar uma exceção, o Kotlin apenas retorna null.

    // !! operator
    val (_,_,_,nota) = student1
    val value2 = nota!!// Garante que o valor não será null mesmo que o tipo permita null.
    // OBS: Usar apenas quando houver certeza que o valor não é nulo

    // Data Class
    val student2 = Student("Letícia", 22, "Cabrini", 10)
    val student3 = Student("André", 22, "Cavalcanti", 7)
    val student4 = student3.copy(nome = "Fernando")

    println(student3 == student2)
    println(student2)
    println(student2)
    println(student4)
}

open class Exemplo()

data class Student(
    val nome: String,
    val idade: Int,
    val sobrenome: String,
    val nota: Int? = null
) : Exemplo()