package ejemplo.demo1.usuario;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UsuarioRepository extends CrudRepository <Usuario, Long> {

    List<Usuario> findAll();
}
