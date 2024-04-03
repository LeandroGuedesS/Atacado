package br.com.uniderp.poo2.atacado.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.uniderp.poo2.atacado.Entities.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping (value = "/api/atacado/produtos")

public class ProdutoController {
    
    @GetMapping
    public List<Produto> getAll() {
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto(01L, 001L, "A Arte de Ligar o Fodase", 2.99, LocalDate.now()));
        lista.add(new Produto(02L, 002L, "Cereal de Morango Nestle", 5.00, LocalDate.now()));
        lista.add(new Produto(03L, 003L, "Picanha", 6.20, LocalDate.now()));
        lista.add(new Produto(04L, 004L, "Morango", 2.49, LocalDate.now()));
        lista.add(new Produto(05L, 005L, "Bolo de Cenoura com Cholocate", 10.67, LocalDate.now()));
        return lista;

    }
    
    
}
