
fun main() {

    val nome: String = "João";
   //Forma que é feita para concatenar no java para comparar como é feito no kotlin
    println("O nome do vizinho é: " + nome + "!")

    //Forma utilizando String template com o simbolo $(dolar)
    println("O nome do cobrador eh $nome!");
    println("O nome do cobrador eh \$nome!") // a barra invertida anular o String Template

    //Forma de como usar String Template com expressão/funções
    println("A soma de dois numeros eh: ${somar(23, 8)}")

}

fun somar(i: Int, i1: Int): Int {
 return i + i1;
}
