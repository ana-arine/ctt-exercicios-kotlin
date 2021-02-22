import exercicio1.Pessoa
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

 val contato = Agenda()

 contato.salvarContato("Ana", "158877-66578")
 contato.salvarContato("Kaue", "4654635454")
 contato.salvarContato( "Juninho", "158877-66578")   // contato não salvo (telefone/chave repetido)
 contato.salvarContato("Bruno", "2642918")
 contato.salvarContato("Bruno", "584545")      // nome repetido
 contato.salvarContato("João", "1568-5527")
 contato.salvarContato("Maria", "875462892")
 contato.salvarContato("Joaquim", "5588-9944")
 contato.salvarContato("Bento", "13982098")
 contato.salvarContato("Fernanda", "19778-552")
 contato.salvarContato("Ruth", "154468-552")
 contato.salvarContato("Ruth", "5544881127")   // contato não salvo (lista cheia)
 contato.salvarContato("José", "775528415")    // contato não salvo (lista cheia)
 contato.salvarContato("José", "5792003")      // contato não salvo (lista cheia)

 println(contato.listaContatos)
 println(contato.listaContatos.size)

 contato.removerContato("Kaue","4654635454")   // removendo contato
 println(contato.listaContatos)
 contato.mostrarAgenda()
 contato.removerContato("X","0000004")  // testando remover contato que não existe
 println("")

 contato.buscarContato("Bruno")
 contato.buscarContato("José")  // tentando remover contato que não existe

 contato.mostrarAgenda()


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