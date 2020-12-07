package br.com.digitalhouse.desafio.bruno

class DigitalHouseManager() {


    var listaDoAlunos = mutableMapOf<Any?, Aluno>()
    var listaDoProfessoresTitular = mutableMapOf<Any?, ProfessorTitular>()
    var listaDoProfessoresAdjunto = mutableMapOf<Any?, ProfessorAdjunto>()
    var listaDoCurso = mutableMapOf<Any?, Curso>()
    val listaDeMatricula = mutableMapOf<Any?, Matricula>()

// FUNÇÃO QUE REGISTRA O CURSO
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        listaDoCurso.put(codigoCurso, Curso(nome = nome, codigoDoCurso = codigoCurso,quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos)
        )
    }

// FUNÇÃO EXCLUIR O CURSO

    fun excluirCurso(codigoCurso: Int) {
        listaDoCurso.remove(codigoCurso)
    }


    // FUNÇÃO QUE VAI REGISTRAR O PROFESSOR ADJUNTO

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listaDoProfessoresAdjunto.put(codigoProfessor,ProfessorAdjunto(nome = nome, sobrenome = sobrenome,codigoDoProfessor = codigoProfessor,quantidadeDeHorasDeMonitoria = quantidadeDeHoras)
        )
    }


    // FUNÇÃO QUE VAI REGISTRAR O PROFESSOR TITULAR

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        listaDoProfessoresTitular.put(codigoProfessor,ProfessorTitular(nome = nome,sobrenome = sobrenome,codigoDoProfessor = codigoProfessor,especialidade = especialidade)
        )
    }


    // FUNÇÃO QUE VAI EXCLUIR O PROFESSOR

    fun excluirProfessor(codigoProfessor: Int) {
        listaDoProfessoresTitular.remove(codigoProfessor)
        listaDoProfessoresAdjunto.remove(codigoProfessor)
    }


   // FUNÇÃO QUE VAI MATRICULAR O ALUNO

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        listaDoAlunos.put(codigoAluno,Aluno(nome = nome, sobrenome = sobrenome, codigoDoAluno = codigoAluno)
        )
    }


   // FUNÇÃO QUE VAI MATRICULAR O ALUNO NO CURSO
    fun matricularAlunonoCurso(codigoAluno: Int, codigoCurso: Int) {
        val alunoASerMatriculado = listaDoAlunos[codigoAluno]
        when {listaDoCurso[codigoCurso]?.listaDeAlunosMatriculados!!.size >= listaDoCurso[codigoCurso]?.quantidadeMaximaDeAlunos!! -> {
                println("Não foi possível matricular o ${listaDoAlunos[codigoAluno]?.nome} no curso, ele já está com a capacidade cheia. Esse curso tem capacidade para ${listaDoCurso[codigoCurso]?.quantidadeMaximaDeAlunos} Pessoas")
            }else ->{listaDoCurso[codigoCurso]?.adicionarUmAluno(alunoASerMatriculado!!)
                println("Matrícula realizada do aluno: ${listaDoAlunos[codigoAluno]?.nome}")
            }
        }
    }


   // FUNÇÃO PARA ALOCAR PROFESSORES

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val professorTitular = listaDoProfessoresTitular[codigoProfessorTitular]
        val professorAdjunto = listaDoProfessoresAdjunto[codigoProfessorAdjunto]
        listaDoCurso[codigoCurso]?.professorTitular = professorTitular
        listaDoCurso[codigoCurso]?.professorAdjunto = professorAdjunto


    }

}