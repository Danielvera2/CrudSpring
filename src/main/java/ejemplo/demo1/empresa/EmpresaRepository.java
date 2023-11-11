package ejemplo.demo1.empresa;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EmpresaRepository extends CrudRepository <Empresa, Long> {

    List<Empresa> findAll();
}