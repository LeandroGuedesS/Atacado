package br.com.uniderp.poo2.atacado.Entities;

import java.time.LocalDate;

public class Classe {
    
    private Long codigo;

    private String nome;

    private LocalDate dataDeInclusao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public Classe() {
    }

    public Classe(Long codigo, String nome, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataDeInclusao = dataDeInclusao;
    }
    
}
