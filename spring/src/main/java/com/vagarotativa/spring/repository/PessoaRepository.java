package com.vagarotativa.spring.repository;

import com.vagarotativa.spring.entidade.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

    @Repository
    public interface PessoaRepository extends JpaRepository<Pessoa,String>{


        static Pessoa findById(long id) {
            return null;
        }

        static void deleteById(Long id) {
            
            
        }

        List findALL();

        Pessoa findClienteById(Long id);

}
