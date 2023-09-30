package upf.br.curriculoDPTO.Repository

import org.springframework.data.repository.CrudRepository
import upf.br.curriculoDPTO.Model.Usuario

interface UsuarioRepository : CrudRepository<Usuario, Int>