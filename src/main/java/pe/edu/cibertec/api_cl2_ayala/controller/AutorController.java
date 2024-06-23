package pe.edu.cibertec.api_cl2_ayala.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.api_cl2_ayala.model.bd.Autor;
import pe.edu.cibertec.api_cl2_ayala.service.IAutorService;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/autor")
public class AutorController {

    private IAutorService iAutorService;

    @GetMapping("")
    public List<Autor> listar(){
        return iAutorService.listarAutores();
    }

    @GetMapping("/{id}")
    public Optional<Autor> obtenerAutorxId(@PathVariable int id){
        return iAutorService.buscarxId(id);
    }

    @PostMapping("")
    public String registrarAutor(Autor autor){
        return iAutorService.agregarAutor(autor);
    }

    @PutMapping("/{id}")
    public String actualizarAutor(int id){
        return iAutorService.actualizarAutorxId(id);
    }

}
