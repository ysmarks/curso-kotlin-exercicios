//Esse exercico visa demonstrar o uso do operador IN para verificar se um valor está presente em uma coleção
fun main() {
    println(isLetter('r'))
    println(isLetter('x'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun IsNotDigit(c: Char) = c !in '0'..'9';