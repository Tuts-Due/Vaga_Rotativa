package com.vagarotativa.spring.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.vagarotativa.spring.enuns.StatusVaga;

@Entity
public class Vaga {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date entrada;

    @Column
    private Date saida;

    @Column
	@Enumerated(EnumType.STRING)
	private StatusVaga statusVaga;


    @OneToOne
    @JoinColumn(name ="placa")
    private Carro carro;
    
    public Vaga(Long id, Date entrada, Date saida,StatusVaga statusVaga) {
        this.id = id;
        this.entrada = entrada;
        this.saida = saida;
        this.statusVaga = statusVaga;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public StatusVaga getStatusVaga() {
        return statusVaga;
    }

    public void setStatusVaga(StatusVaga statusVaga) {
        this.statusVaga = statusVaga;
    }

}
