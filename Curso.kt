package br.com.digitalhouse.desafio.bruno

class Curso(
        val nome: String,
        val codigoDoCurso: Int,
        val quantidadeMaximaDeAlunos: Int,
        var professorTitular: ProfessorTitular? = ProfessorTitular("", "", 0, 0,""),
        var professorAdjunto: ProfessorAdjunto? = ProfessorAdjunto("", "", 0, 0, 0)

) {


    val listaDeAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        when {
            listaDeAlunosMatriculados.size < quantidadeMaximaDeAlunos -> {
                listaDeAlunosMatriculados.add(umAluno)
                return true
            }
            else -> return false
        }
    }

    fun excluirAluno(umAluno: Aluno){
        listaDeAlunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return ("O curso ${nome}, ${codigoDoCurso}, ${quantidadeMaximaDeAlunos}, ${professorTitular}, ${professorAdjunto}, ${listaDeAlunosMatriculados}")
    }


}