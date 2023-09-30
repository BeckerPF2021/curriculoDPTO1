package upf.br.curriculoDPTO.Repository

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import java.util.Date

@Component
class DataInitializer(private val dataRepository: DataRepository) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        // Dados iniciais para os usuários
        val usuario1 = Usuario(1, "Usuario1", "senha1")
        val usuario2 = Usuario(2, "Usuario2", "senha2")
        dataRepository.usuarios.addAll(listOf(usuario1, usuario2))

        // Dados iniciais para os currículos
        val curriculo1 = Curriculo(1, 1, "Nome1", Date(), "Masculino", "Brasileiro", "Endereço1", "123-456-7890", "email1@example.com")
        val curriculo2 = Curriculo(2, 2, "Nome2", Date(), "Feminino", "Americano", "Endereço2", "987-654-3210", "email2@example.com")
        dataRepository.curriculos.addAll(listOf(curriculo1, curriculo2))
    }
}
