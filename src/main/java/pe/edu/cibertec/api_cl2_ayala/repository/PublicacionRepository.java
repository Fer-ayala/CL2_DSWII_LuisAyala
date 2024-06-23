package pe.edu.cibertec.api_cl2_ayala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_cl2_ayala.model.bd.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion,Integer> {
}
