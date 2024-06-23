package pe.edu.cibertec.api_cl2_ayala.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_cl2_ayala.model.bd.Autor;
import pe.edu.cibertec.api_cl2_ayala.repository.AutorRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AutorService implements IAutorService{

    AutorRepository autorRepository;

    @Override
    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    @Override
    public Optional<Autor> buscarxId(int id) {
        return autorRepository.findById(id);
    }

    @Override
    public String agregarAutor(Autor autor) {
        autorRepository.save(autor);
        return "Agregado con exito";
    }

    @Override
    public String actualizarAutorxId(int id) {
        Optional<Autor> autor = buscarxId(id);
        Autor objAutor;
        if(autor.isPresent()){
            objAutor = autor.get();
            autorRepository.save(objAutor);
            return "Actualizado con exito";
        }
        return "No se pudo actualizar porque no existe el registro";
    }
}
