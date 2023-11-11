package ejemplo.demo1.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo2")
@CrossOrigin(("*"))
public class EmpresaController {
    
    // consumir el servicio
    @Autowired
    private EmpresaService empresaService;

    // metodo para crear la sub ruta de create
    @PostMapping("/")
    public Empresa save(@RequestBody Empresa entity) {
        return empresaService.save(entity);
    }

    // Metodo getAll
    @GetMapping("/")
    public List<Empresa> findAll() {
        return empresaService.findAll();
    }

    // Metodo getOne
    @GetMapping("/{id}/")
    public Empresa getOne(@PathVariable long id) {
        return empresaService.findOne(id);
    }

    // // Metodo update
    // @PutMapping("/{id}/")
    // public Usuario update(@PathVariable long id, @RequestBody Usuario updatedEntity) {
    //     Usuario usuario = usuarioService.findOne(id).orElseThrow(null);
    //     if (usuario == null) {
    //         // Maneja el caso en que el usuario no se encuentra
    //         System.out.println("Usuario no encontrado");
    //         return null;
    //     }
    //     // Actualiza los campos del usuario aquí
    //     return usuarioService.save(usuario);
    // }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable long id){
        empresaService.deleteById(id);
    }
}
