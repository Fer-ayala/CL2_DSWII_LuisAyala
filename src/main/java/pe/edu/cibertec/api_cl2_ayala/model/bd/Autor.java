package pe.edu.cibertec.api_cl2_ayala.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Autor")
@Data
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAutor")
    private Integer idAutor;

    @Column(name = "NomAutor", nullable = false, length = 50)
    private String nomAutor;

    @Column(name = "ApeAutor", nullable = false, length = 50)
    private String apeAutor;

    @Column(name = "FechNacAutor", nullable = false)
    private Date fechNacAutor;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Publicacion> publicaciones;
}
