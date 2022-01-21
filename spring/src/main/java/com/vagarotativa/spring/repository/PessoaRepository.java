package com.vagarotativa.spring.repository;

import com.vagarotativa.spring.cliente.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{

}
