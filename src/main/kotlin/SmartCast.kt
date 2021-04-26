import java.lang.IllegalArgumentException

interface Expressao

class Numero(val numero: Int) : Expressao
class Soma(val direita: Expressao, val esqueda: Expressao) : Expressao

fun avaliacao(expressao: Expressao) : Int {

    if(expressao is Numero) {
        return expressao.numero
    }

    if (expressao is Soma) {
        return avaliacao(expressao.direita) + avaliacao(expressao.esqueda)
    }

    throw IllegalArgumentException("Expressão desconhecida")
}

fun main() {
    //((1 + 2) + 4) exemplo para o exercicio
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}