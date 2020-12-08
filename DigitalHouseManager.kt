package br.com.digitalhouse.desafio.bruno

class DigitalHouseManager() {


    val listaDoAlunos = mutableMapOf<Any?, Aluno>()
    val listaDoProfessoresTitular = mutableMapOf<Any?, ProfessorTitular>()
    val listaDoProfessoresAdjunto = mutableMapOf<Any?, ProfessorAdjunto>()
    val listaDoCurso = mutableMapOf<Any?, Curso>()
    val listaDeMatricula = mutableMapOf<Any?, Matricula>()

// FUNÇÃO QUE REGISTRA O CURSO
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        listaDoCurso.put(codigoCurso, Curso(nome = nome, codigoDoCurso = codigoCurso,quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos)
        )
    println("O curso ${nome} com o codigo ${codigoCurso} e quantidade maxima de alunos ${quantidadeMaximaDeAlunos} realizado com sucesso")
    }

// FUNÇÃO EXCLUIR O CURSO

    fun excluirCurso(codigoCurso: Int) {
        listaDoCurso.remove(codigoCurso)
        println("O curso ${codigoCurso} foi removido")
    }


    // FUNÇÃO QUE VAI REGISTRAR O PROFESSOR ADJUNTO

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        listaDoProfessoresAdjunto.put(codigoProfessor,ProfessorAdjunto(nome = nome, sobrenome = sobrenome,codigoDoProfessor = codigoProfessor,quantidadeDeHorasDeMonitoria = quantidadeDeHoras)
        )
        println("O professor adjunto com o nome ${nome} ${sobrenome} com codigo ${codigoProfessor} e quantidade de horas monitoria de ${quantidadeDeHoras}  foi registrado com sucesso   ")
    }

    // FUNÇÃO QUE VAI REGISTRAR O PROFESSOR TITULAR

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        listaDoProfessoresTitular.put(codigoProfessor,ProfessorTitular(nome = nome,sobrenome = sobrenome,codigoDoProfessor = codigoProfessor,especialidade = especialidade)
        )
        println("O professor titular com o nome ${nome} ${sobrenome} com codigo ${codigoProfessor}  e especialista em ${especialidade} foi registrado com sucesso")

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
        println("Matricula realizada com sucesso do aluno ${nome} ${sobrenome} codigo do aluno é ${codigoAluno}")
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
        when {
            professorTitular != null -> {
                listaDoCurso[codigoCurso]?.professorTitular = professorTitular
            }
        }
        println("O professor titular com o codigo do curso ${codigoCurso} codigo do professor ${codigoProfessorTitular} foi alocado com sucesso ")
        when {
            professorAdjunto != null -> {
                listaDoCurso[codigoCurso]?.professorAdjunto = professorAdjunto
            }
        }
        println("O professor Adjunto com o codigo do curso ${codigoCurso} codigo do professor ${codigoProfessorAdjunto} foi alocado com sucesso")


    }


}