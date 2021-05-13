import java.util.*

//Imprimir as representações binarias dos caracteres de A a F

fun main() {

    val binaryRepresentation = TreeMap<Char, String>()

    for (l in 'A'..'F') {
        val binary = Integer.toBinaryString(l.toInt())
        binaryRepresentation[l] = binary
    }

    for ((letter, binary) in binaryRepresentation) {
        println("$letter - $binary")
    }
}