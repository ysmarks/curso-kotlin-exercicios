class Retangulo(
    val altura: Int,
    val largura: Int
) {
    // acessores/propriedades customizada, exemplo 1 usando expressão
    val isQuadrado = altura == largura

    // acessores/propriedades customizada, exemplo 2 usando corpo de bloco
    val isQuadrado1 : Boolean
    get() {
        return altura == largura
    }


}

fun main() {
    //Para o exemplo 1
    val retangulo: Retangulo = Retangulo(10, 11); //exemplo 1 false
    println(retangulo.isQuadrado)

    //para o exemplo 2
    val retangulo1: Retangulo = Retangulo(8, 8)
    println(retangulo1.isQuadrado1)
}