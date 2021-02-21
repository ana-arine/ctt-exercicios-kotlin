import exercicio1.Pessoa
import java.time.LocalDateTime

import exercicio2.Agenda
import exercicio3.RH

fun main() {

    // Exercício 1:

    val usuario = Pessoa(
    nome = "Ana Oliveira",
    dataNascimento = "29/02/1990",
    altura = 1.74
)
   println(usuario.mostrarTudo())


//-------------------------------------------------------------------------
// Exercício 2:

    val agenda = Agenda()

    agenda.salvarContato("Ana", "158877-66578")
    agenda.salvarContato("Kaue", "4654635454")
    agenda.salvarContato( "Juninho", "158877-66578")  //telefone (chave) repetido
    agenda.salvarContato("Bruno", "2642918")
    agenda.salvarContato("Bruno", "584545")   // nome repetido
    agenda.salvarContato("João", "1568-552")
    println(agenda.listaContatos)
    agenda.removerContato("Kaue","4654635454")   // removendo contato
    println(agenda.listaContatos)
    agenda.removerContato("X","0000004")  // testando remover contato que não existe
    println("")

    agenda.buscarContato("Bruno")
    agenda.buscarContato("José")  // tentando remover contato que não existe

    agenda.mostrarAgenda()

//-------------------------------------------------------------------------
// Exercício 3:

    val rh = RH()
    println(rh)
    println("Salvando dados dos funcionarios")
    // Povoando banco de dados manualmente
    rh.salvarDados("6564", "Alan", "9789796", 7889.8, "G")
    rh.salvarDados("sdf4", "Joaquina", "4456", 7585.5, "P")
    rh.salvarDados("7774", "Valentin", "22096", 1000.0, "P")

    rh.entrarDados() // Entrando com dados com readline

    println(rh.bancoFuncionarios)  // mostra que os dados foram salvos no Map

    rh.buscarFuncionario()

    rh.reajusteSalario("7774")


}