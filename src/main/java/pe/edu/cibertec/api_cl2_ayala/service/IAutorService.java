package pe.edu.cibertec.api_cl2_ayala.service;

import pe.edu.cibertec.api_cl2_ayala.model.bd.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> listarAutores();
    Optional<Autor> buscarxId(int id);
    String agregarAutor(Autor autor);
    String actualizarAutorxId(int id);
}
