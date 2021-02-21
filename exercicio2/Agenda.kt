package exercicio2

class Agenda(){

    var listaContatos : MutableMap<String, String> = mutableMapOf()   // Neste caso, o telefone foi escolhido como chave pois o nome pode ser repetido na agenda, mas o telefone, não.

    fun salvarContato(nome: String, telefone: String) {

        if (telefone !in listaContatos && listaContatos.size <= 10) {
            listaContatos[telefone] = nome      // Atribui um nome (valor) a um telefone (chave)
            println("Contato adicionado com sucesso!")
        } else {
            println("Este contato já existe ou sua agenda está cheia!")
        }
    }

    fun removerContato(nome: String, telefone: String){
        if (telefone in listaContatos && listaContatos[telefone] == nome){
            listaContatos.remove(telefone)
            println("Contato removido.")
        } else {
            println("Contato não encontrado.")
        }
    }

    fun buscarContato(nome: String) {
        var contador : Int = 0
        for (chave in listaContatos.keys) {
            if (nome == listaContatos[chave]) {
                println("${listaContatos[chave]} ....... $chave")
                contador += 1
            }
        }
        println("$contador contatos encontrados.")
    }


    fun mostrarAgenda(){
        println("=========================")
        println("       SUA AGENDA      ")
        println("=========================")
        println(" Nome ...... Telefone ")
        println("-------------------------")

        for (item in listaContatos) {
            println("${item.value} .... ${item.key}")
        }
    }

}
