import java.util.ArrayList

//Essa tarefa visa explicar a diferença entre Listas em java e Lista no Kotlin
fun main() {

    // ArrayList a instanciando a classe
    val frutas = ArrayList<String>()
    frutas.add("Goiaba")
    frutas.add("Pera")
    frutas.add("Uva")
    println(frutas)

    //ArrayList usando função Kotlin
    val legumes = arrayListOf("Cenoura", "Batata", "Cebola")
    println(legumes)

    //funções interessantes
    println(legumes.last())
    println(legumes.size)
}