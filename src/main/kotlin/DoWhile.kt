//O objetivo é mostrar como funciona o laço de repetição do-while
fun main() {
    var temperatura: Int
    var somatorio: Int = 0
    var quantidade: Int = 0

    do {
       println("Informe um numero ou 999 para sair: ")
       temperatura = readLine()!!.toInt()

        if (temperatura != 999) {
            somatorio += temperatura
            quantidade++;
        }
    }while (temperatura != 999)

    println("A media de temperatura é ${somatorio/quantidade}")
}