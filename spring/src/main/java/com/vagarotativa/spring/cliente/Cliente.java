package com.vagarotativa.spring.cliente;

public class Cliente {
    private String nome;
    private int numeroTelefone;

    public Cliente() {
    }

    public Cliente(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTelefone() {
        return this.numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

   /* public Cliente nome(String nome) {
        setNome(nome);
        return this;
    }

    public Cliente numeroTelefone(int numeroTelefone) {
        setNumeroTelefone(numeroTelefone);
        return this;
    }*/



}