import java.lang.IllegalArgumentException

// esse exercicio tem como objetivo demonstrar o lancemento de exceção no Kotlin
fun main() {
 println(porcentagem(120))
}

fun porcentagem(number: Int) : String {
    return if (number in 1..100) {
        "$number%"
    }else {
        throw IllegalArgumentException("Numero deve ser entre 1 e 100");
    }
}