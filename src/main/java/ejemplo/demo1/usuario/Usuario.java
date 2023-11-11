package ejemplo.demo1.usuario;

import ejemplo.demo1.empresa.Empresa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String lastname;
    private String email;

    //*Relacion con la entidad empresa */
    @ManyToOne
    private Empresa empresa;

}
