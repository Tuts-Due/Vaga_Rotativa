package com.vagarotativa.spring.repository;
import java.util.List;

import com.vagarotativa.spring.entidade.Carro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface CarroRepository extends JpaRepository<Carro,String>{
        

        static List<Carro> findALL() {
            return null;
        }

        static void deleteById(Long id) {
        }

        static Carro findById(long id) {
            return null;
        }
}
