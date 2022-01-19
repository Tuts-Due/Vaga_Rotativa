package com.vagarotativa.spring.repository;

import com.vagarotativa.spring.cliente.ClienteDono;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ClienteRepository extends JpaRepository<ClienteDono,Integer>{

}
