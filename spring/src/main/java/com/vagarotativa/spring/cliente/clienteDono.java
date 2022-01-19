package com.vagarotativa.spring.cliente;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

    @Entity
    public class clienteDono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nome;
    private Integer numeroTelefone;

    @ManyToOne
    @JoinColumn(name="categoria_id")
    
    private List<Carro> carros = new ArrayList<>();

    public clienteDono() {
        super();
    }

    public clienteDono(Integer id, String nome, Integer numeroTelefone) {
        this.id = id;
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return java.util.Objects.equals(id, that.id);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}