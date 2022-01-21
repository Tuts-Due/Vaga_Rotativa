package com.vagarotativa.spring.cliente;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carro implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String fabricante;
    private String modelo;
    private String placa;
    private String cor;
    
    @ManyToOne
    @JoinColumn(name ="pessoa_id")

    private Pessoa pessoa;

    public Carro() {
    super();
    }
    
    public Carro(Integer id, String fabricante, String modelo, String placa, String cor, Pessoa pessoa) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.pessoa = pessoa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Carro carro = (Carro) object;
        return java.util.Objects.equals(id, carro.id);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}