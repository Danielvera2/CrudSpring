package ejemplo.demo1.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpresaService {

    //
    @Autowired
    private EmpresaRepository empresaRepository;

    // CRUD
    // Metodo POST
    public Empresa save(Empresa entity) {
        return empresaRepository.save(entity);
    }

    // Metodo GetAll
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    // Metodo getOne busca por id
    public Empresa findOne(long id) {
        return empresaRepository.findById(id).orElse(null);
    }

    //! Metodo Delete
    public void deleteById(long id){
        empresaRepository.deleteById(id);
    }
    


}
