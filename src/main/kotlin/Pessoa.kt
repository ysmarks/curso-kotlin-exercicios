class Pessoa(

    val nome : String,
    val idade : Int
)

fun main() {

    //Exemplo de instancia do objeto em Kotlin
    var pessoa1: Pessoa = Pessoa("João", 33);
    var pessoa2: Pessoa = Pessoa("Gabriela", 28);

    println("Pessoa 1: ${pessoa1.nome}")
    println("Pessoa 2: ${pessoa2.nome}")

}
