package upf.br.curriculoDPTO.Controller

import org.springframework.web.bind.annotation.*
import upf.br.curriculoDPTO.Service.UsuarioService

@RestController
@RequestMapping("/usuarios")
class UsuarioController(private val usuarioService: UsuarioService: UsuarioService) {
    @PostMapping
    fun criarUsuario(@RequestBody usuario: Usuario) = usuarioService.criarUsuario(usuario)

    @GetMapping
    fun listarUsuarios() = usuarioService.listarUsuarios()

    @GetMapping("/{id}")
    fun encontrarUsuario(@PathVariable id: Int) = usuarioService.encontrarUsuarioPorId(id)

    @PutMapping("/{id}")
    fun atualizarUsuario(@PathVariable id: Int, @RequestBody usuario: Usuario) {
        if (usuarioService.encontrarUsuarioPorId(id) != null) {
            usuarioService.atualizarUsuario(usuario)
        }
    }

    @DeleteMapping("/{id}")
    fun deletarUsuario(@PathVariable id: Int) = usuarioService.deletarUsuario(id)
}