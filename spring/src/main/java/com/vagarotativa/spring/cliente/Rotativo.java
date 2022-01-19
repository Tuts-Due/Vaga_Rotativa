package com.vagarotativa.spring.cliente;

import java.util.Objects;

public class Rotativo {
    private Integer id;
    private Integer entrada;
    private Integer saida;

    public Rotativo(Integer id, Integer entrada, Integer saida) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getSaida() {
        return saida;
    }

    public void setSaida(Integer saida) {
        this.saida = saida;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Rotativo rotativo = (Rotativo) object;
        return java.util.Objects.equals(id, rotativo.id);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }
}
