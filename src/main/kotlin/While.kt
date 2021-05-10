// O objetivo é demonstrar de maneira simples o uso do operador while
fun main() {

    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 999) {
        println("Informe a temperatura ou 999 para sair: ")
        temperatura = readLine()!!.toInt()//forçando o metodo readLine aceitar um inteiro

        if (temperatura != 999) {
            somatorio += temperatura
            quantidade++
        }
    }
    println("A media de temperatura é: ${somatorio/quantidade}")
}