package com.vagarotativa.spring.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class clienteDono {

    private String nome;
    private Integer numeroTelefone;

    private List<Carro> carros = new ArrayList<>();

    public clienteDono() {
        super();
    }

    public clienteDono(String nome, Integer numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(Integer numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        clienteDono that = (clienteDono) object;
        return java.util.Objects.equals(nome, that.nome) && java.util.Objects.equals(numeroTelefone, that.numeroTelefone) && java.util.Objects.equals(carros, that.carros);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), nome, numeroTelefone, carros);
    }
}