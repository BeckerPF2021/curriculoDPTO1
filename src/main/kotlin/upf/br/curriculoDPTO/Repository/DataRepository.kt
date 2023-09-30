package upf.br.curriculoDPTO.Repository

import org.springframework.stereotype.Repository

@Repository
class DataRepository {
    // Simulação de armazenamento de dados em memória
    val usuarios: MutableList<Usuario> = mutableListOf()
    val curriculos: MutableList<Curriculo> = mutableListOf()
}
