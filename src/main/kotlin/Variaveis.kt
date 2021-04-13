
    fun main() {
        //funcVariaveisImataveis()
        funcVariaveisMutaveis()
    }

    fun funcVariaveisImataveis() {
        val nome = "Leão";
        val sobreNome: String = "Da Floresta"
        println("Seu completo é: $nome $sobreNome")
    }

    fun funcVariaveisMutaveis() {
        var nome = "Joao"
        var idade: Int = 23;

        println("$nome tem $idade de idade")
    }
