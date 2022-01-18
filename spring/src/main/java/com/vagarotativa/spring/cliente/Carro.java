package com.vagarotativa.spring.cliente;

import java.util.Objects;

public class Carro {

    private String fabricante;
    private String modelo;
    private String placa;
    private String cor;

    private clienteDono pessoa;

    public Carro() {
    super();
    }

    public Carro(String fabricante, String modelo, String placa, String cor, clienteDono pessoa) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.pessoa = pessoa;
        
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Carro carro = (Carro) object;
        return fabricante.equals(carro.fabricante) && modelo.equals(carro.modelo) && placa.equals(carro.placa) && cor.equals(carro.cor) && pessoa.equals(carro.pessoa);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), fabricante, modelo, placa, cor);
    }
}