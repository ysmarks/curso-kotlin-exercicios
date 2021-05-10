//O objetivo é demonstrar como funciona o uso do laço de repetição for
fun main() {
    for (number:Int in 1..50) {
        println(fizBuzz(number))
    }

}

fun fizBuzz(number: Int) = when {
    //Regras descritas para impressão
    number % 15 == 0 -> "FizzBuzz"
    number % 3 == 0 -> "Fizz"
    number % 5 == 0 -> "Buzz"
    else -> "$number"
}