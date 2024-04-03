package br.com.uniderp.poo2.atacado.Entities;

import java.time.LocalDate;

public class Subclasse {
    
    private Long codigo;

    private Long codigoClasse;

    private String nome;

    private LocalDate dataDeInclusao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(Long codigoClasse) {
        this.codigoClasse = codigoClasse;
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

    public Subclasse() {
    }

    public Subclasse(Long codigo, Long codigoClasse, String nome, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoClasse = codigoClasse;
        this.nome = nome;
        this.dataDeInclusao = dataDeInclusao;
    }

}
