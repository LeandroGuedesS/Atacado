package br.com.uniderp.poo2.atacado.Controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.uniderp.poo2.atacado.Entities.Subclasse;

import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api/atacado/subclasses")

public class SubclasseController {
       
        @GetMapping
        public List<Subclasse> getAll() {
            List<Subclasse> lista = new ArrayList<>();
            
            lista.add(new Subclasse(1L, 3L, "Livros", LocalDate.now()));
            lista.add(new Subclasse(2L, 5L, "Integrais", LocalDate.now()));
            lista.add(new Subclasse(3L, 4L, "Vermelhas", LocalDate.now()));
            lista.add(new Subclasse(4L, 1L, "Frescos", LocalDate.now()));
            lista.add(new Subclasse(5L, 2L, "Bolos", LocalDate.now()));

            return lista;
        }
    }
    

