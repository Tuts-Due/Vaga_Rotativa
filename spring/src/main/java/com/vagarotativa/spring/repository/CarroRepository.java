package com.vagarotativa.spring.repository;
import com.vagarotativa.spring.entidade.Carro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


    @Repository
    public interface CarroRepository extends JpaRepository<Carro,Integer>{
        Carro findByPlaca(@Param("placa") String placa);
}
