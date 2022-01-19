package com.vagarotativa.spring.repository;
import com.vagarotativa.spring.cliente.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface CarroRepository extends JpaRepository<Carro,Integer>{
}
