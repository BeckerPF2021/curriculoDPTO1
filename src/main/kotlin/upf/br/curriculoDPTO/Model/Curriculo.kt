package upf.br.curriculoDPTO.Model

import java.util.Date

data class Curriculo(
        val idCurriculo: Int,
        val idUser: Int,
        val nomeCompleto: String,
        val dataNascimento: Date,
        val genero: String,
        val nacionalidade: String,
        val endereco: String,
        val telefoneContato: String,
        val email: String
)