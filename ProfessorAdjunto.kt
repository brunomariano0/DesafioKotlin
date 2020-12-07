package br.com.digitalhouse.desafio.bruno

class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        tempoDeCasa: Int = 0,
        codigoDoProfessor: Int,
        val quantidadeDeHorasDeMonitoria: Int
)

    : Professor(nome, sobrenome, tempoDeCasa, codigoDoProfessor) {


}