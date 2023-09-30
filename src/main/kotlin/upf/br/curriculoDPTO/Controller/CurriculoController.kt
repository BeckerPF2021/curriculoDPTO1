package upf.br.curriculoDPTO.Controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/curriculos")
class CurriculoController(private val curriculoService: CurriculoService) {
    @PostMapping
    fun criarCurriculo(@RequestBody curriculo: Curriculo) = curriculoService.criarCurriculo(curriculo)

    @GetMapping
    fun listarCurriculos() = curriculoService.listarCurriculos()

    @GetMapping("/{id}")
    fun encontrarCurriculo(@PathVariable id: Int) = curriculoService.encontrarCurriculoPorId(id)

    @PutMapping("/{id}")
    fun atualizarCurriculo(@PathVariable id: Int, @RequestBody curriculo: Curriculo) {
        if (curriculoService.encontrarCurriculoPorId(id) != null) {
            curriculoService.atualizarCurriculo(curriculo)
        }
    }

    @DeleteMapping("/{id}")
    fun deletarCurriculo(@PathVariable id: Int) = curriculoService.deletarCurriculo(id)
}