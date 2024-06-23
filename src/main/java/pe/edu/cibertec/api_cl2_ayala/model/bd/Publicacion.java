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
    private Integer idpublicacion;
    private String titulo;
    private String resumen;
    private Date fechpublicacion;

    @ManyToOne
    @JoinColumn(name = "idautor", nullable = false)
    private Autor autor;
}