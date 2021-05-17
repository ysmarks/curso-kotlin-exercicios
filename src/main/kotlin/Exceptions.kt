import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException

// esse exercicio tem como objetivo demonstrar o lancemento de exceção no Kotlin
fun main() {
 //println(porcentagem(120))
    println(lerIdade())
}

fun porcentagem(number: Int) : String {
    return if (number in 1..100) {
        "$number%"
    }else {
        throw IllegalArgumentException("Numero deve ser entre 1 e 100")
    }
}

fun lerIdade() : Int? {

    val file = FileReader(File("src/main/kotlin/idade.txt"))
    val buffer = BufferedReader(file)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null
    }finally {
        buffer.close()
    }
}