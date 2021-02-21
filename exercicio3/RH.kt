package exercicio3

class RH() {

    val bancoFuncionarios : MutableMap<String, Funcionario> = mutableMapOf()   // A chave é o ID e o valor é o funcionário.

    fun entrarDados() {
        println("ADICIONANDO NOVO FUNCIONÁRIO")
        print("ID: ")
        val idEntrado = readLine().toString()
        print("Nome: ")
        val nomeEntrado = readLine().toString()
        print("CPF: ")
        val cpfEntrado = readLine().toString()
        print("Salário atual: R$ ")
        val salarioAtualEntrado = readLine()!!.toDouble()
        print("O funcionário é gestor (G) ou programador (P)? ")
        val cargoEntrado = readLine().toString()

        salvarDados(idEntrado, nomeEntrado, cpfEntrado, salarioAtualEntrado, cargoEntrado)
    }

    fun salvarDados(id: String, nome: String, cpf: String, salarioAtual: Double, cargo: String) {

        when (cargo) {
            "G" -> bancoFuncionarios[id] = Gestor(nome, cpf, salarioAtual)
            else -> bancoFuncionarios[id] = Programador(nome, cpf, salarioAtual)
        }
        println("Funcionário salvo com sucesso!")
    }

    fun buscarFuncionario() {
        println("BUSCA DE FUNCIONÁRIO")
        print("ID do funcionário: ")
        val id = readLine().toString()

        println("[1] Exibir os dados do funcionário")
        println("[2] Aumentar salário do funcionário")
        var opcao = readLine()?.toInt()

        if(opcao == 1){

            if (id in bancoFuncionarios) {
                println("Nome     :  ${bancoFuncionarios[id]?.nome}")
                println("CPF      :  ${bancoFuncionarios[id]?.cpf}")
                println("Salário  :  ${bancoFuncionarios[id]?.salarioAtual}")
            } else {
                println("ID não encontrado")
            }
        }
        if (opcao == 2) reajusteSalario(id)
            }

    fun reajusteSalario(id: String) {
        bancoFuncionarios[id]!!.salarioAtual =
            bancoFuncionarios[id]!!.indiceReajuste * bancoFuncionarios[id]!!.salarioAtual
    println("Salário reajustado: ${bancoFuncionarios[id]!!.salarioAtual}")
    }


}

