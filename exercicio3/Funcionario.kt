package exercicio3

abstract class Funcionario(val nome: String,
                           val cpf: String,
                           var salarioAtual: Double) {

abstract val indiceReajuste: Double     // Abstract val: cada classe herdeira deverá
                                        // declarar o seu próprio índice de reajuste.

}