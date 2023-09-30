package upf.br.curriculoDPTO.Service

import org.springframework.stereotype.Service
import upf.br.curriculoDPTO.Repository.UsuarioRepository

@Service
class UsuarioService(private val usuarioRepository: UsuarioRepository) {
    fun criarUsuario(usuario: Usuario): Usuario {
        return usuarioRepository.save(usuario)
    }

    fun listarUsuarios(): List<Usuario> {
        return usuarioRepository.findAll().toList()
    }

    fun encontrarUsuarioPorId(id: Int): Usuario? {
        return usuarioRepository.findById(id).orElse(null)
    }

    fun atualizarUsuario(usuario: Usuario): Usuario {
        return usuarioRepository.save(usuario)
    }

    fun deletarUsuario(id: Int) {
        usuarioRepository.deleteById(id)
    }
}