package com.vagarotativa.spring.repository;
import java.util.List;

import com.vagarotativa.spring.entidade.Vaga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface VagaRepository extends JpaRepository<Vaga,Integer>{

    List<Vaga> findAllByIdPlaca(Integer idPlaca);
}
