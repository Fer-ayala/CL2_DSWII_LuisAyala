package pe.edu.cibertec.api_cl2_ayala.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Publicacion")
@Data
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPublicacion")
    private Integer idPublicacion;

    @Column(name = "Titulo", nullable = false, length = 250)
    private String titulo;

    @Column(name = "Resumen", nullable = false, length = 250)
    private String resumen;

    @Column(name = "FechPublicacion", nullable = false)
    private Date fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "IdAutor", nullable = false)
    private Autor autor;
}