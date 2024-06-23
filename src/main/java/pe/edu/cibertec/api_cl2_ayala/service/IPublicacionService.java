package pe.edu.cibertec.api_cl2_ayala.service;

import pe.edu.cibertec.api_cl2_ayala.model.bd.Autor;
import pe.edu.cibertec.api_cl2_ayala.model.bd.Publicacion;

import java.util.List;
import java.util.Optional;

public interface IPublicacionService {
    List<Publicacion> listarPublicaciones();
    Optional<Publicacion> buscarxId(int id);
    String agregarPublicacion(Publicacion publicacion);
    String actualizarPublicacionxId(int id);
}
