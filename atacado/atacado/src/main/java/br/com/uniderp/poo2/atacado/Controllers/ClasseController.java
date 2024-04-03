package br.com.uniderp.poo2.atacado.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.uniderp.poo2.atacado.Entities.Classe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api/atacado/classes")

public class ClasseController {

    @GetMapping
    public List<Classe> getAll() {
        List<Classe> lista = new ArrayList<>();

        lista.add(new Classe(1L, "Papelaria", LocalDate.now()));
        lista.add(new Classe(2L, "Cereais", LocalDate.now()));
        lista.add(new Classe(3L, "Carnes", LocalDate.now()));
        lista.add(new Classe(4L, "Horti Fruti", LocalDate.now()));
        lista.add(new Classe(5L, "Padaria", LocalDate.now()));
        return lista;
    }

}
