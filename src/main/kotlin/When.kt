//Usando na função a expressão WHEN dentro de um corpo de expressão
fun obterMnemonica(cor: Cor) =

    when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }
//Usando na função a expressão WHEN dentro de um corpo de bloco
fun obterTemperatura(cor: Cor) : String {
    return when(cor) {
        Cor.LARANJA, Cor.AMARELO, Cor.VERMELHO -> "QUENTE"
        Cor.VERDE -> "NEUTRO"
        Cor.AZUL -> "FRIO"
    }
}
fun main() {

    val mNemonica = obterMnemonica(Cor.LARANJA)
    println(mNemonica)
    println("--------------------------")
    val temperatura = obterTemperatura(Cor.AZUL)
    println(temperatura)
}