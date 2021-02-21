package exercicio1

import java.time.LocalDateTime

// Declaração dos atributos privados na Classe Pessoa:
class Pessoa(private var nome: String,
             private var dataNascimento: String,
             private var altura: Double) {

    // Métodos públicos que acessam as variáveis privadas:
    fun mostrarNome(): String {
        return nome
    }
    fun mostrarDataNasc(): String {
        return dataNascimento
    }
    fun mostrarAltura(): Double {
        return altura
    }

    // Função que extrai o dia do nascimento, a partir da data de nascimento:
    fun mostraDia(): Int {
        var diaNascimento = dataNascimento.split("/").first().toInt()    //O método split "fatia" a sentença em 3 partes e, nesse caso, pega a primeira sentença para o dia (first).
        return diaNascimento
        }

    // Função que extrai o mês de nascimento em String, a partir da data de nascimento:
    fun mostraMes(): String {
        var mesNascimento = dataNascimento.split("/")[1].toInt()    // A posição [1] é referente ao mês após aplicar o método split.
        return when (mesNascimento) {
            1 -> "Janeiro"
            2 -> "Fevereiro"
            3 -> "Março"
            4 -> "Abril"
            5 -> "Maio"
            6 -> "Junho"
            7 -> "Julho"
            8 -> "Agosto"
            9 -> "Setembro"
            10 -> "Outubro"
            11 -> "Novembro"
            12 -> "Dezembro"
            else -> "(mês inválido)"
        }
        }

    // Função que calcula a idade da pessoa a partir de uma data em String
    fun calculaIdade(): Int {
        var anoNascimento = dataNascimento.split("/").last().toInt()  // Extraindo o ano de nascimento para o cálculo da idade.
        var idade = (LocalDateTime.now().year  - anoNascimento)
        return (idade)
    }

    // Função que retorna a String com variáveis preenchidas
    fun mostrarTudo(): String {
        return "$nome nasceu em ${mostraDia()} de ${mostraMes()}, tem ${calculaIdade()} anos e possui $altura m de altura."
    }
}
