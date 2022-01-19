package com.vagarotativa.spring.repository;
import com.vagarotativa.spring.cliente.Vaga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface VagaRepository extends JpaRepository<Vaga,Integer>{
}
