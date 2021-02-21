package exercicio3

class Gestor(nome: String,
             cpf: String,
             salarioAtual: Double) : Funcionario(nome, cpf, salarioAtual){
val cargo = "Gestor"
                 override val indiceReajuste = 1.1

             }
