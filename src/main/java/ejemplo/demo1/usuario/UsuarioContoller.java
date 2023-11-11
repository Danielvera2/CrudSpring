package ejemplo.demo1.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
@CrossOrigin(("*"))
public class UsuarioContoller {
    // consumir el servicio
    @Autowired
    private UsuarioService usuarioService;

    // metodo para crear la sub ruta de create
    @PostMapping("/")
    public Usuario save(@RequestBody Usuario entity) {
        return usuarioService.save(entity);
    }

    // Metodo getAll
    @GetMapping("/")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    // Metodo getOne
    @GetMapping("/{id}/")
    public Usuario getOne(@PathVariable long id) {
        return usuarioService.findOne(id);
    }

    // Metodo update
    @PutMapping("/{id}/")
    public Usuario update(@RequestBody Usuario entity) {
        return usuarioService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        usuarioService.deleteById(id);
    }
}
