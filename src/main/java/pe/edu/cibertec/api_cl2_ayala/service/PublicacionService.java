package pe.edu.cibertec.api_cl2_ayala.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.api_cl2_ayala.model.bd.Autor;
import pe.edu.cibertec.api_cl2_ayala.model.bd.Publicacion;
import pe.edu.cibertec.api_cl2_ayala.repository.PublicacionRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PublicacionService implements IPublicacionService {

    PublicacionRepository publicacionRepository;

    @Override
    public List<Publicacion> listarPublicaciones() {
        return publicacionRepository.findAll();
    }

    @Override
    public Optional<Publicacion> buscarxId(int id) {
        return publicacionRepository.findById(id);
    }

    @Override
    public String agregarPublicacion(Publicacion publicacion) {
        publicacionRepository.save(publicacion);
        return "agregado correctamente";
    }

    @Override
    public String actualizarPublicacionxId(int id) {
        Optional<Publicacion> publicacion = buscarxId(id);
        Publicacion objPub;
        if(publicacion.isPresent()){
            objPub = publicacion.get();
            publicacionRepository.save(objPub);
            return "Actualizado con exito";
        }
        return "No se pudo actualizar";
    }
}
