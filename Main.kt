package br.com.digitalhouse.desafio.bruno

fun main() {

    val executar = DigitalHouseManager()

    //Registro dos Professores Titular

    executar.registrarProfessorTitular("João","Silva",45,"Android")
    executar.registrarProfessorTitular("Felipe","Silva",25,"Android")

    println("Registro dos professores titulares realizado com sucesso")
    // Não sei dá quebra de linha no kotlin, esse foi o jeito que eu arrumei para deixar a leitura melhor.
    println("")

    // Registro dos Professores Adjutos

    executar.registrarProfessorAdjunto("Fernando","Ferreira",12,12)
    executar.registrarProfessorAdjunto("Lucas","Ferreira",22,65)

    println("Registro dos professores Adjuntos realizado com sucesso")
    // Não sei dá quebra de linha no kotlin, esse foi o jeito que eu arrumei para deixar a leitura melhor.
    println("")



    // Registro dos Cursos

    executar.registrarCurso("Full Stack",20001,3)
    executar.registrarCurso("Android",20002,2)

    println("Registro do curso Full Stack e Android foi efetuado com sucesso")
    // Não sei dá quebra de linha no kotlin, esse foi o jeito que eu arrumei para deixar a leitura melhor.
    println("")



    //Alocar Professor Titular e Adjunto em cada curso

    executar.alocarProfessores(20001,45,12)
    executar.alocarProfessores(20001,25,22)

    println("Professor foi alocado no curso com sucesso")
    // Não sei dá quebra de linha no kotlin, esse foi o jeito que eu arrumei para deixar a leitura melhor.
    println("")


    //Matricular Alunos

    executar.matricularAluno("Bruno","Mariano",123,)
    executar.matricularAluno("Wander","Mariano",456,)
    executar.matricularAluno("Wanderlei","Mariano",789,)
    executar.matricularAluno("Lucas","Da Silva",321,)
    executar.matricularAluno("Ayrton","Silva",654,)
    executar.matricularAluno("Diego","Ferreira",987,)

    println("Matricula do alunos feita com sucesso")
    // Não sei dá quebra de linha no kotlin, esse foi o jeito que eu arrumei para deixar a leitura melhor.
    println("")




    // Matricular dois alunos no curso Full Stack

    executar.matricularAlunonoCurso(123,20001)
    executar.matricularAlunonoCurso(456,20001)

    println("Aluno Matriculado com sucesso no curso de Full Stack")
    // Não sei dá quebra de linha no kotlin, esse foi o jeito que eu arrumei para deixar a leitura melhor.
    println("")


    //Matricular três alunos no curso de Android

    executar.matricularAlunonoCurso(321,20002)
    executar.matricularAlunonoCurso(654,20002)
    executar.matricularAlunonoCurso(987,20002)

    println("Alunos matriculado com sucesso no curso android")
    // Não sei dá quebra de linha no kotlin, esse foi o jeito que eu arrumei para deixar a leitura melhor.
    println("")



}