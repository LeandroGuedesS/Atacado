package br.com.uniderp.poo2.atacado.Entities;

import java.time.LocalDate;

public class Produto {
    
    private Long codigo;

    private Long codigoSubclasse;

    private String nome;

    private Double preco;

    private LocalDate dataDeInclusao;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCodigoSubclasse() {
        return codigoSubclasse;
    }

    public void setCodigoSubclasse(Long codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public Produto() {
    }

    public Produto(Long codigo, Long codigoSubclasse, String nome, Double preco, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoSubclasse = codigoSubclasse;
        this.nome = nome;
        this.preco = preco;
        this.dataDeInclusao = dataDeInclusao;
    }
    
}
