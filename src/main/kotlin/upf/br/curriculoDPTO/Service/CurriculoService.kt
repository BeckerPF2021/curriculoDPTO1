package upf.br.curriculoDPTO.Service

import org.springframework.stereotype.Service
import upf.br.curriculoDPTO.Repository.CurriculoRepository

@Service
class CurriculoService(private val curriculoRepository: CurriculoRepository) {
    fun criarCurriculo(curriculo: Curriculo): Curriculo {
        return curriculoRepository.save(curriculo)
    }

    fun listarCurriculos(): List<Curriculo> {
        return curriculoRepository.findAll().toList()
    }

    fun encontrarCurriculoPorId(id: Int): Curriculo? {
        return curriculoRepository.findById(id).orElse(null)
    }

    fun atualizarCurriculo(curriculo: Curriculo): Curriculo {
        return curriculoRepository.save(curriculo)
    }

    fun deletarCurriculo(id: Int) {
        curriculoRepository.deleteById(id)
    }
}