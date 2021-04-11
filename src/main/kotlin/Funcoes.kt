fun main() {
    println(min(23, 45))
}
//bloco
fun max(param1: Int, param2: Int): Int {
    return if(param1 > param2) param1 else param2;
}

//expressão
fun min(param1: Int, param2: Int) = if (param1 < param2) param1 else param2;