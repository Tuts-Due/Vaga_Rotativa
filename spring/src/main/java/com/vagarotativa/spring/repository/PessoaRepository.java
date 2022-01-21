package com.vagarotativa.spring.repository;

import com.vagarotativa.spring.entidade.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{

        Pessoa findPessoaByNumeroTelefone(String numeroTelefone);

}
