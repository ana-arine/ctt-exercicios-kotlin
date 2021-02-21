package exercicio3

class Programador(nome: String,
                  cpf: String,
                  salarioAtual: Double) : Funcionario(nome, cpf, salarioAtual){
    val cargo = "Programador"
    override val indiceReajuste = 1.2

                  }
