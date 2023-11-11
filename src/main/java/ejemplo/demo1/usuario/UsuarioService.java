package ejemplo.demo1.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    //
    @Autowired
    private UsuarioRepository usuarioRepository;

    // CRUD
    // Metodo POST
    public Usuario save(Usuario entity) {
        return usuarioRepository.save(entity);
    }

    // Metodo GetAll
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    // Metodo getOne busca por id
    public Usuario findOne(long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    //! Metodo Delete
    public void deleteById(long id){
        usuarioRepository.deleteById(id);
    }
    


}
