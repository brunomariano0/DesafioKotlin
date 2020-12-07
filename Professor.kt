package br.com.digitalhouse.desafio.bruno

open class Professor (val nome: String, val sobrenome: String, val tempoDeCasa: Int, var codigoDoProfessor: Int) {

    override fun toString(): String {
        return ("O Professor ${nome}, ${sobrenome}, ${tempoDeCasa}, ${codigoDoProfessor}")
    }
}