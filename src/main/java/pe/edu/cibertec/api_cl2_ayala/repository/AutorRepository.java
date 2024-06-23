package pe.edu.cibertec.api_cl2_ayala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.api_cl2_ayala.model.bd.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Integer> {
}
